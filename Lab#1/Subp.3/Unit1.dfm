object Form1: TForm1
  Left = 153
  Top = 114
  Width = 430
  Height = 448
  Caption = 'Form1'
  Color = clBtnFace
  Font.Charset = DEFAULT_CHARSET
  Font.Color = clWindowText
  Font.Height = -11
  Font.Name = 'MS Sans Serif'
  Font.Style = []
  OldCreateOrder = False
  PixelsPerInch = 96
  TextHeight = 13
  object GraphZone: TPaintBox
    Left = 160
    Top = 160
    Width = 233
    Height = 233
  end
  object Label1: TLabel
    Left = 176
    Top = 24
    Width = 41
    Height = 16
    Caption = 'Label1'
    Font.Charset = DEFAULT_CHARSET
    Font.Color = clWindowText
    Font.Height = -13
    Font.Name = 'MS Sans Serif'
    Font.Style = []
    ParentFont = False
  end
  object Label2: TLabel
    Left = 120
    Top = 104
    Width = 48
    Height = 16
    Caption = 'Label2'
    Font.Charset = DEFAULT_CHARSET
    Font.Color = clGreen
    Font.Height = -15
    Font.Name = 'MS Sans Serif'
    Font.Style = [fsBold]
    ParentFont = False
  end
  object Edit1: TEdit
    Left = 160
    Top = 64
    Width = 209
    Height = 21
    TabOrder = 0
    Text = 'Edit1'
  end
  object BlackPanel: TPanel
    Left = 112
    Top = 160
    Width = 41
    Height = 233
    Color = clBackground
    TabOrder = 1
    object GreenPanel: TPanel
      Left = 0
      Top = 0
      Width = 41
      Height = 233
      Hint = 'Panel'
      Color = clLime
      TabOrder = 0
    end
  end
  object StartBtn: TButton
    Left = 16
    Top = 192
    Width = 81
    Height = 25
    Hint = 'StartBtn'
    HelpType = htKeyword
    Caption = 'Start'
    ParentShowHint = False
    ShowHint = True
    TabOrder = 2
    OnClick = StartBtnClick
  end
  object StopBtn: TButton
    Left = 16
    Top = 240
    Width = 81
    Height = 25
    Caption = 'Stop'
    TabOrder = 3
    OnClick = StopBtnClick
  end
  object Button3: TButton
    Left = 16
    Top = 296
    Width = 81
    Height = 25
    Caption = 'Exit'
    TabOrder = 4
    OnClick = Button3Click
  end
  object Timer1: TTimer
    OnTimer = Timer1Timer
    Left = 24
    Top = 24
  end
  object GraphTimer: TTimer
    OnTimer = GraphTimerTimer
    Left = 24
    Top = 88
  end
end
