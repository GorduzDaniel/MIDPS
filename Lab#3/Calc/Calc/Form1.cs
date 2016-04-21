using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Calc
{
    public partial class Form1 : Form
    {
        Double value = 0;
        String operation = "";
        bool oper_pressed = false;

        public Form1()
        {
            InitializeComponent();
        }

        private void Button_Click(object sender, EventArgs e)
        {
            if ((result.Text == "0")||(oper_pressed))
                result.Clear();
           Button b = (Button)sender;

            if (b.Text == ",")
            {
                if (!result.Text.Contains(","))
                    result.Text = result.Text + b.Text;
                if (oper_pressed)
                    result.Text = "0,";
            }
            
            else
                result.Text += b.Text;

            oper_pressed = false;
        }

        private void Button20_Click(object sender, EventArgs e)
        {
            result.Text = "0";
        }

        private void oper_click(object sender, EventArgs e)
        {
            Button b = (Button)sender;
            operation = b.Text;
            value = Double.Parse(result.Text);
            oper_pressed = true;
            equas.Text = value + "" + operation;
        }

        private void Button17_Click(object sender, EventArgs e)
        {
            oper_pressed = false;
            equas.Text = "";
            switch (operation)
            {
                case "+":
                    result.Text= (value + Double.Parse(result.Text)).ToString();
                    break;
                case "-":
                    result.Text = (value - Double.Parse(result.Text)).ToString();
                    break;
                case "x":
                    result.Text = (value * Double.Parse(result.Text)).ToString();
                    break;
                case "/":
                    result.Text = (value / Double.Parse(result.Text)).ToString();
                    break;
                default:
                    break;
            }
            
        }

        private void Button21_Click(object sender, EventArgs e)
        {
            result.Clear();
            value = 0;
            equas.Text = "";
            result.Text = "0";
        }

        private void equasion(object sender, EventArgs e)
        {

        }

        private void Button6_Click(object sender, EventArgs e)
        {
            result.Text = (-Double.Parse(result.Text)).ToString();
        }

        private void Button18_Click(object sender, EventArgs e)
        {
            result.Text = (Double.Parse(result.Text) * Double.Parse(result.Text)).ToString();
        }

        private void Button19_Click(object sender, EventArgs e)
        {
            result.Text = Convert.ToString(Math.Sqrt(Convert.ToDouble(result.Text)));
        }
    }
}
