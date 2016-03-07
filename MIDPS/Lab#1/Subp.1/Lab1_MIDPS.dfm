object Form1: TForm1
  Left = 190
  Top = 232
  Width = 334
  Height = 233
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
    Left = 120
    Top = 16
    Width = 171
    Height = 13
    Caption = 'Incrementarea/decrementare contor'
    Color = clBtnFace
    Font.Charset = DEFAULT_CHARSET
    Font.Color = clRed
    Font.Height = -11
    Font.Name = 'MS Sans Serif'
    Font.Style = []
    ParentColor = False
    ParentFont = False
  end
  object Label2: TLabel
    Left = 192
    Top = 48
    Width = 89
    Height = 13
    Caption = 'i scade in Edit1'
    Font.Charset = DEFAULT_CHARSET
    Font.Color = clWindowText
    Font.Height = -11
    Font.Name = 'MS Sans Serif'
    Font.Style = [fsBold]
    ParentFont = False
  end
  object Button1: TButton
    Left = 24
    Top = 64
    Width = 81
    Height = 25
    Caption = 'Increment(+)'
    TabOrder = 0
    OnClick = Button1Click
  end
  object Button2: TButton
    Left = 24
    Top = 120
    Width = 81
    Height = 25
    Caption = 'Decrement(-)'
    TabOrder = 1
    OnClick = Button2Click
  end
  object Edit1: TEdit
    Left = 128
    Top = 88
    Width = 33
    Height = 21
    TabOrder = 2
    Text = 'Edit1'
  end
  object BitBtn1: TBitBtn
    Left = 216
    Top = 152
    Width = 73
    Height = 25
    Caption = 'EXIT'
    TabOrder = 3
    OnClick = BitBtn1Click
  end
end
