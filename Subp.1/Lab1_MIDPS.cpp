//---------------------------------------------------------------------------
#include <vcl.h>
#pragma hdrstop

#include "Lab1_MIDPS.h"
//---------------------------------------------------------------------------
#pragma package(smart_init)
#pragma resource "*.dfm"
TForm1 *Form1;
int i=0;
//---------------------------------------------------------------------------
__fastcall TForm1::TForm1(TComponent* Owner)
        : TForm(Owner)
{
   Edit1->Text="0";
   Form1->Caption="MIDPS";

}
//---------------------------------------------------------------------------
void __fastcall TForm1::Button1Click(TObject *Sender)
{
        Edit1->Text=++i;


}
//---------------------------------------------------------------------------
void __fastcall TForm1::Button2Click(TObject *Sender)
{
        Edit1->Text=--i;
}
//---------------------------------------------------------------------------

void __fastcall TForm1::BitBtn1Click(TObject *Sender)
{
    Close();
}
//---------------------------------------------------------------------------



