//---------------------------------------------------------------------------

#ifndef Lab1_MIDPS_CronometruH
#define Lab1_MIDPS_CronometruH
//---------------------------------------------------------------------------
#include <Classes.hpp>
#include <Controls.hpp>
#include <StdCtrls.hpp>
#include <Forms.hpp>
#include <ExtCtrls.hpp>
//---------------------------------------------------------------------------
class TForm1 : public TForm
{
__published:	// IDE-managed Components
        TTimer *Timer1;
        TTimer *CronTimer;
        TLabel *Label1;
        TLabel *Label2;
        TButton *Start;
        TButton *Stop;
        TButton *Zero;
        TButton *Exit;
        TEdit *Edit1;
        TEdit *Edit2;
        void __fastcall ExitClick(TObject *Sender);
        void __fastcall Timer1Timer(TObject *Sender);
        void __fastcall StartClick(TObject *Sender);
        void __fastcall Label1Click(TObject *Sender);
        void __fastcall Label2Click(TObject *Sender);
        void __fastcall CronTimerTimer(TObject *Sender);
        void __fastcall StopClick(TObject *Sender);
        void __fastcall ZeroClick(TObject *Sender);
private:	// User declarations
public:		// User declarations
        __fastcall TForm1(TComponent* Owner);
};
//---------------------------------------------------------------------------
extern PACKAGE TForm1 *Form1;
//---------------------------------------------------------------------------
#endif
