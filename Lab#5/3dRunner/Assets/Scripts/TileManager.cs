using UnityEngine;
using System.Collections;
using System.Collections.Generic;

public class TileManager : MonoBehaviour {

    public GameObject[] tilePrefabs;

    public GameObject currentTile;

    private static TileManager instance;

    private Stack<GameObject> leftTiles = new Stack<GameObject>();
    private Stack<GameObject> topTiles = new Stack<GameObject>();

    public static TileManager Instance
    {
        get
        {
            if (instance == null)
                instance = GameObject.FindObjectOfType<TileManager>();
            return instance;
        }
    }

    public Stack<GameObject> LeftTiles
    {
        get
        {
            return leftTiles;
        }

        set
        {
            leftTiles = value;
        }
    }

    public Stack<GameObject> TopTiles
    {
        get
        {
            return topTiles;
        }

        set
        {
            topTiles = value;
        }
    }

    // Use this for initialization
    void Start () {
        CreateTiles(100); 

        for (int i = 0; i < 50; i++)
        {
            SpawnTile();
        }
	}
	
	// Update is called once per frame
	void Update () {
	
	}

    public void CreateTiles(int amount)
    {
        for(int i = 0; i < amount; i++)
        {
            LeftTiles.Push(Instantiate(tilePrefabs[0]));
            TopTiles.Push(Instantiate(tilePrefabs[1]));
            TopTiles.Peek().name = "topTiles";
            TopTiles.Peek().SetActive(false);
            TopTiles.Peek().name = "topTiles";
            LeftTiles.Peek().SetActive(false);
        }
    }

    public void SpawnTile()
    {
        if(LeftTiles.Count==0 || TopTiles.Count == 0)
        {
            CreateTiles(10);
        }
        //Generam un nr random  intre 0 si 1
        int randomIndex = Random.Range(0, 2);
        if (randomIndex == 0)
        {
            GameObject tmp = LeftTiles.Pop();
            tmp.SetActive(true);
            tmp.transform.position = currentTile.transform.GetChild(0).transform.GetChild(randomIndex).position;
            currentTile = tmp;
        }
        else if (randomIndex == 1)
        {
            GameObject tmp = TopTiles.Pop();
            tmp.SetActive(true);
            tmp.transform.position = currentTile.transform.GetChild(0).transform.GetChild(randomIndex).position;
            currentTile = tmp;
        }
        int spawnPickup = Random.Range(0, 10);
        if (spawnPickup == 0)
        {
            currentTile.transform.GetChild(1).gameObject.SetActive(true);
        }

       //currentTile = (GameObject)Instantiate(tilePrefabs[randomIndex],currentTile.transform.GetChild(0).transform.GetChild(randomIndex).position,Quaternion.identity);
    }
    public void ResetGame()
    {
        Application.LoadLevel(Application.loadedLevel);
    }
}
