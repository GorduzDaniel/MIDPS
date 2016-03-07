//---------------------------------------------------------------------------

#include <vcl.h>
#pragma hdrstop
#include <time.h>
#include <stdio.h>
#include <dos.h>

#include "Lab1_MIDPS_Cronometru.h"
//---------------------------------------------------------------------------
#pragma package(smart_init)
#pragma resource "*.dfm"


TForm1 *Form1;
struct date d;
struct time t;
int min=0;
int sec=0;
int zec=0;
//---------------------------------------------------------------------------
__fastcall TForm1::TForm1(TComponent* Owner)
        : TForm(Owner)
{
        Label1->Caption="Realizarea unui Cronometru in C++ Builder";
        Form1->Caption="MIDPS";
        Label2->Caption="C++ Builder CRONOMETRU";
        Label2->Font->Color=clGreen;
        Edit2->Text="00 min 00 sec  00 zec";
        CronTimer->Enabled=false;
        Stop->Enabled=false;
        Zero->Enabled=false;

}
//---------------------------------------------------------------------------
void __fastcall TForm1::ExitClick(TObject *Sender)
{
        Close();
}
//---------------------------------------------------------------------------
void __fastcall TForm1::Timer1Timer(TObject *Sender)
{
        Timer1->Interval=1000;
        char buf[20];
        getdate(&d);
        gettime(&t);
        sprintf(buf,"%02d-%02d-%4d %02d:%02d:%02d",d.da_day,d.da_mon,d.da_year,
                t.ti_hour,t.ti_min,t.ti_sec);
        Edit1->Text=(AnsiString)buf;
}
//---------------------------------------------------------------------------

void __fastcall TForm1::StartClick(TObject *Sender)
{
        Start->Enabled=false;
        Stop->Enabled=true;
        CronTimer->Enabled=true;
        Zero->Enabled=false;
}
//---------------------------------------------------------------------------


void __fastcall TForm1::Label1Click(TObject *Sender)
{
        Label1->Caption="Realizarea Unui Cronometru in C++Builder";        
}
//---------------------------------------------------------------------------

void __fastcall TForm1::Label2Click(TObject *Sender)
{
       Label2->Caption="C++Builder CRONOMETRU";
}
//---------------------------------------------------------------------------


void __fastcall TForm1::CronTimerTimer(TObject *Sender)
{
        char buf[20];
        zec++;
        if(zec==10){
                zec=0;
                sec++;
                if(sec==59){
                        zec=0;
                        sec=0;
                        min++;
                        }
                }
        sprintf(buf,"%02d min  %02d sec  %02d zec",min,sec,zec);
        Edit2->Text=(AnsiString)buf;
}
//---------------------------------------------------------------------------

void __fastcall TForm1::StopClick(TObject *Sender)
{
        Start->Enabled=true;
        Stop->Enabled=false;
        Zero->Enabled=true;
        CronTimer->Enabled=false;

}
//---------------------------------------------------------------------------

void __fastcall TForm1::ZeroClick(TObject *Sender)
{
        Stop->Enabled=false;
        char buf[20];
        min=0;
        sec=0;
        zec=0;
        sprintf(buf,"%02d min  %02d sec  %02d zec",min,sec,zec);
        Edit2->Text=(AnsiString)buf;
}
//---------------------------------------------------------------------------


