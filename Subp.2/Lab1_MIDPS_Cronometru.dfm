object Form1: TForm1
  Left = 75
  Top = 128
  Width = 439
  Height = 328
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
  object Label1: TLabel
    Left = 200
    Top = 24
    Width = 32
    Height = 13
    Caption = 'Label1'
    Font.Charset = DEFAULT_CHARSET
    Font.Color = clBlue
    Font.Height = -11
    Font.Name = 'MS Sans Serif'
    Font.Style = []
    ParentFont = False
    OnClick = Label1Click
  end
  object Label2: TLabel
    Left = 184
    Top = 136
    Width = 185
    Height = 13
    Caption = 'Label2'
    OnClick = Label2Click
  end
  object Start: TButton
    Left = 24
    Top = 136
    Width = 57
    Height = 25
    Hint = 'Button1'
    Caption = 'Start'
    TabOrder = 0
    OnClick = StartClick
  end
  object Stop: TButton
    Left = 24
    Top = 168
    Width = 57
    Height = 25
    Hint = 'Button 2'
    Caption = 'Stop'
    TabOrder = 1
    OnClick = StopClick
  end
  object Zero: TButton
    Left = 24
    Top = 200
    Width = 57
    Height = 25
    Hint = 'Button 3'
    Caption = 'Zero'
    TabOrder = 2
    OnClick = ZeroClick
  end
  object Exit: TButton
    Left = 336
    Top = 240
    Width = 57
    Height = 25
    Caption = 'Exit'
    TabOrder = 3
    OnClick = ExitClick
  end
  object Edit1: TEdit
    Left = 192
    Top = 64
    Width = 185
    Height = 21
    TabOrder = 4
    Text = 'Edit1'
  end
  object Edit2: TEdit
    Left = 152
    Top = 176
    Width = 225
    Height = 21
    TabOrder = 5
    Text = 'Edit2'
  end
  object Timer1: TTimer
    OnTimer = Timer1Timer
    Left = 40
    Top = 32
  end
  object CronTimer: TTimer
    Interval = 100
    OnTimer = CronTimerTimer
    Left = 40
    Top = 72
  end
end
