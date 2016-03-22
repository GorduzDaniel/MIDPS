//---------------------------------------------------------------------------

#include <vcl.h>
#pragma hdrstop
#include <time.h>
#include <dos.h>
#include <stdio.h>
#include <math.h>

#include "Unit1.h"
//---------------------------------------------------------------------------
#pragma package(smart_init)
#pragma resource "*.dfm"
TForm1 *Form1;
struct date d;
struct time t;
int x = 0;
int y = 100;
int pas = 0;
//---------------------------------------------------------------------------
__fastcall TForm1::TForm1(TComponent* Owner)
        : TForm(Owner)
{
        Form1->Caption="MIDPS";
        Edit1->Clear();
        Timer1->Enabled=true;
        Label2->Caption="Resurse grafice ale mdeiului C++Builder";
        Label1->Caption="Data si ora curenta";
        StopBtn->Enabled=false;

        GreenPanel->Height = 0;
        BlackPanel->Color=RGB(0,0,0);
        GreenPanel->Color=RGB(29,120,77);

        GraphTimer->Enabled=false;
        GraphTimer->Interval=500;


}
//---------------------------------------------------------------------------


void __fastcall TForm1::Button3Click(TObject *Sender)
{
        Close();
}
//---------------------------------------------------------------------------


void __fastcall TForm1::Timer1Timer(TObject *Sender)
{
        Timer1->Interval=1000;
        char buff[20];
        getdate(&d);
        gettime(&t);
        sprintf(buff,"%02d-%02d-%4d\t%02d:%02d:%02d",d.da_day,d.da_mon,
        d.da_year,t.ti_hour,t.ti_min,t.ti_sec);
        Edit1->Text=(AnsiString)buff;
}
//---------------------------------------------------------------------------




void __fastcall TForm1::StartBtnClick(TObject *Sender)
{
        StartBtn->Enabled = false;
        StopBtn->Enabled = true;
        GraphTimer->Enabled = true;
        GraphZone -> Canvas -> Pen -> Color = clBlack;
        GraphZone -> Canvas -> Brush -> Color = clSilver;
        GraphZone -> Canvas -> Brush -> Style = bsCross;
        GraphZone -> Canvas -> Rectangle(0,0,233,201);
        GraphZone -> Canvas -> Pen -> Color = clRed;
}
//---------------------------------------------------------------------------

void __fastcall TForm1::StopBtnClick(TObject *Sender)
{
        StartBtn->Enabled = true;
        StopBtn->Enabled = false;
        GraphTimer->Enabled = false;
}
//---------------------------------------------------------------------------

void __fastcall TForm1::GraphTimerTimer(TObject *Sender)
{
        GraphZone -> Canvas -> MoveTo(x,y);
        do
        {
           if (pas % 2 == 0)
           {
              y = y + rand() % 85;
              pas++;
           }
           else
           {
              y = y - rand() % 85;
              pas++;
           }
        }
        while (y < 75 || y > 125);
                x +=1 ;

        GreenPanel -> Height = y;
        GraphZone -> Canvas -> LineTo(x,y);
        if (x >= 233)
        {
           GraphTimer -> Enabled = false;
           StopBtn->Enabled=false;
           StartBtn->Enabled=false;
        }
}
//---------------------------------------------------------------------------

