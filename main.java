/*
 * SUDOKU GAME CREATED BY TEAM 6 
 * YEART 1 ; SEMESTER 2 ; 
 * COURSE - DATA STRUCTURES AND ALGORITHMS
 * DEPT - CSE - AIE 
 */


import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;


public class main {
    
    public static void main(String[] args) {
        
        // CREATING NEW UI OBJECT
        new UI() ;        
    }
}

// CUSTOM GAMEBUTTON WITH EXTRA PROPERTY buttonID 
// buttonID IS A UNIQUE ID FOR ALL THE BUTTONS IN THIS PROJECT SO THAT
// WE CAN FIND AN MANAGE BUTTONS USING THIS BUTTONS IN THE CODE
class GameButton extends JButton {

    String buttonID ;
    int value ;
}

// NEW UI CLASS FOR GUI WHICH INHERITS THE javax.swing.JFrame CLASS 
// AND IMPLEMENTS ACTIONLISTENER CLASS TO RECORD BUTTONCLICKS 
class UI extends JFrame implements ActionListener {

    // region INTIALIZING CONSTANTS

    int sudo_array[][] = new int[9][9] ;

    GameButton currentSelectedButton ;
    
    GameButton buttons[] ;
    GameButton button11 ,button12 ,button13 ,button14 ,button15 ,button16 ,button17 ,button18 ,button19 ;
    GameButton button21 ,button22 ,button23 ,button24 ,button25 ,button26 ,button27 ,button28 ,button29 ;
    GameButton button31 ,button32 ,button33 ,button34 ,button35 ,button36 ,button37 ,button38 ,button39 ;
    GameButton button41 ,button42 ,button43 ,button44 ,button45 ,button46 ,button47 ,button48 ,button49 ;
    GameButton button51 ,button52 ,button53 ,button54 ,button55 ,button56 ,button57 ,button58 ,button59 ;
    GameButton button61 ,button62 ,button63 ,button64 ,button65 ,button66 ,button67 ,button68 ,button69 ;
    GameButton button71 ,button72 ,button73 ,button74 ,button75 ,button76 ,button77 ,button78 ,button79 ;
    GameButton button81 ,button82 ,button83 ,button84 ,button85 ,button86 ,button87 ,button88 ,button89 ;
    GameButton button91 ,button92 ,button93 ,button94 ,button95 ,button96 ,button97 ,button98 ,button99 ;

    JTextField gameLog, textField ;

    JComboBox comboBox ;

    String themes[] = { "Cutie", "Charcoal", "Nuke", "Ocean", "Vector", "Lemon" } ;

    // endregion

    UI() {

        /*
        sudo_array = new int[][] {
            { 3, 0, 6, 5, 0, 8, 4, 0, 0 },
            { 5, 2, 0, 0, 0, 0, 0, 0, 0 },
            { 0, 8, 7, 0, 0, 0, 0, 3, 1 },
            { 0, 0, 3, 0, 1, 0, 0, 8, 0 },
            { 9, 0, 0, 8, 6, 3, 0, 0, 5 },
            { 0, 5, 0, 0, 9, 0, 6, 0, 0 },
            { 1, 3, 0, 0, 0, 0, 2, 5, 0 },
            { 0, 0, 0, 0, 0, 0, 0, 7, 4 },
            { 0, 0, 5, 2, 0, 6, 3, 0, 0 }
        };
        

        for (int[] row : sudo_array) {
            
            System.out.println( Arrays.toString(row) );
        }

        int N = sudo_array.length;
 
        if (SolveSudoku(sudo_array, N))
        {
            // print solution
            for (int[] row : sudo_array) {

                System.out.println( Arrays.toString( row ) );
            }
        }
        else {
            System.out.println("No solution");
        }

        SolveSudoku(sudo_array, N) ;
        */

        ImageIcon ico = new ImageIcon( "./Assets/icons8-pastime-64.png" ) ;
        this.setIconImage( ico.getImage() );

        /*
        for( int[] row : sudo_array )
        {
            for( int i = 0 ; i < row.length ; i ++ ) {

                row[i] = 0 ;
            }
        }
        */

        
        JLabel c00 = new JLabel("(0,0)");
        c00.setBounds(20,20, 30, 30);
        JLabel c01 = new JLabel("(8,0)");
        c01.setBounds(500,20, 30, 30);
        JLabel c10 = new JLabel("(0,8)");
        c10.setBounds(20,500, 30, 30);
        JLabel c11 = new JLabel("(8,8)");
        c11.setBounds(500,500, 30, 30);

        JLabel theme = new JLabel("Theme :");
        theme.setBounds(10,0, 50, 30);

        comboBox = new JComboBox<>( themes ) ;
        comboBox.setBounds(70,5 , 100, 20);
        comboBox.addActionListener(this);

        // region INIT BUTTONS

        // INITIALIZING ALL THE BUTTONS  
        // refer "Assets/codeGenerator.ipynb" for code
        button11 = new GameButton() ; button11.setBounds(50, 50, 50, 50); button11.setBackground(Color.WHITE); button11.addActionListener( this ); button11.buttonID = "11" ;
        button12 = new GameButton() ; button12.setBounds(50, 100, 50, 50); button12.setBackground(Color.WHITE); button12.addActionListener( this ); button12.buttonID = "12" ;
        button13 = new GameButton() ; button13.setBounds(50, 150, 50, 50); button13.setBackground(Color.WHITE); button13.addActionListener( this ); button13.buttonID = "13" ;
        button14 = new GameButton() ; button14.setBounds(50, 200, 50, 50); button14.setBackground(Color.WHITE); button14.addActionListener( this ); button14.buttonID = "14" ;
        button15 = new GameButton() ; button15.setBounds(50, 250, 50, 50); button15.setBackground(Color.WHITE); button15.addActionListener( this ); button15.buttonID = "15" ;
        button16 = new GameButton() ; button16.setBounds(50, 300, 50, 50); button16.setBackground(Color.WHITE); button16.addActionListener( this ); button16.buttonID = "16" ;
        button17 = new GameButton() ; button17.setBounds(50, 350, 50, 50); button17.setBackground(Color.WHITE); button17.addActionListener( this ); button17.buttonID = "17" ;
        button18 = new GameButton() ; button18.setBounds(50, 400, 50, 50); button18.setBackground(Color.WHITE); button18.addActionListener( this ); button18.buttonID = "18" ;
        button19 = new GameButton() ; button19.setBounds(50, 450, 50, 50); button19.setBackground(Color.WHITE); button19.addActionListener( this ); button19.buttonID = "19" ;
     
        button21 = new GameButton() ; button21.setBounds(100, 50, 50, 50); button21.setBackground(Color.WHITE); button21.addActionListener( this ); button21.buttonID = "21" ;
        button22 = new GameButton() ; button22.setBounds(100, 100, 50, 50); button22.setBackground(Color.WHITE); button22.addActionListener( this ); button22.buttonID = "22" ;
        button23 = new GameButton() ; button23.setBounds(100, 150, 50, 50); button23.setBackground(Color.WHITE); button23.addActionListener( this ); button23.buttonID = "23" ;
        button24 = new GameButton() ; button24.setBounds(100, 200, 50, 50); button24.setBackground(Color.WHITE); button24.addActionListener( this ); button24.buttonID = "24" ;
        button25 = new GameButton() ; button25.setBounds(100, 250, 50, 50); button25.setBackground(Color.WHITE); button25.addActionListener( this ); button25.buttonID = "25" ;
        button26 = new GameButton() ; button26.setBounds(100, 300, 50, 50); button26.setBackground(Color.WHITE); button26.addActionListener( this ); button26.buttonID = "26" ;
        button27 = new GameButton() ; button27.setBounds(100, 350, 50, 50); button27.setBackground(Color.WHITE); button27.addActionListener( this ); button27.buttonID = "27" ;
        button28 = new GameButton() ; button28.setBounds(100, 400, 50, 50); button28.setBackground(Color.WHITE); button28.addActionListener( this ); button28.buttonID = "28" ;
        button29 = new GameButton() ; button29.setBounds(100, 450, 50, 50); button29.setBackground(Color.WHITE); button29.addActionListener( this ); button29.buttonID = "29" ;
     
        button31 = new GameButton() ; button31.setBounds(150, 50, 50, 50); button31.setBackground(Color.WHITE); button31.addActionListener( this ); button31.buttonID = "31" ;
        button32 = new GameButton() ; button32.setBounds(150, 100, 50, 50); button32.setBackground(Color.WHITE); button32.addActionListener( this ); button32.buttonID = "32" ;
        button33 = new GameButton() ; button33.setBounds(150, 150, 50, 50); button33.setBackground(Color.WHITE); button33.addActionListener( this ); button33.buttonID = "33" ;
        button34 = new GameButton() ; button34.setBounds(150, 200, 50, 50); button34.setBackground(Color.WHITE); button34.addActionListener( this ); button34.buttonID = "34" ;
        button35 = new GameButton() ; button35.setBounds(150, 250, 50, 50); button35.setBackground(Color.WHITE); button35.addActionListener( this ); button35.buttonID = "35" ;
        button36 = new GameButton() ; button36.setBounds(150, 300, 50, 50); button36.setBackground(Color.WHITE); button36.addActionListener( this ); button36.buttonID = "36" ;
        button37 = new GameButton() ; button37.setBounds(150, 350, 50, 50); button37.setBackground(Color.WHITE); button37.addActionListener( this ); button37.buttonID = "37" ;
        button38 = new GameButton() ; button38.setBounds(150, 400, 50, 50); button38.setBackground(Color.WHITE); button38.addActionListener( this ); button38.buttonID = "38" ;
        button39 = new GameButton() ; button39.setBounds(150, 450, 50, 50); button39.setBackground(Color.WHITE); button39.addActionListener( this ); button39.buttonID = "39" ;
     
        button41 = new GameButton() ; button41.setBounds(200, 50, 50, 50); button41.setBackground(Color.WHITE); button41.addActionListener( this ); button41.buttonID = "41" ;
        button42 = new GameButton() ; button42.setBounds(200, 100, 50, 50); button42.setBackground(Color.WHITE); button42.addActionListener( this ); button42.buttonID = "42" ;
        button43 = new GameButton() ; button43.setBounds(200, 150, 50, 50); button43.setBackground(Color.WHITE); button43.addActionListener( this ); button43.buttonID = "43" ;
        button44 = new GameButton() ; button44.setBounds(200, 200, 50, 50); button44.setBackground(Color.WHITE); button44.addActionListener( this ); button44.buttonID = "44" ;
        button45 = new GameButton() ; button45.setBounds(200, 250, 50, 50); button45.setBackground(Color.WHITE); button45.addActionListener( this ); button45.buttonID = "45" ;
        button46 = new GameButton() ; button46.setBounds(200, 300, 50, 50); button46.setBackground(Color.WHITE); button46.addActionListener( this ); button46.buttonID = "46" ;
        button47 = new GameButton() ; button47.setBounds(200, 350, 50, 50); button47.setBackground(Color.WHITE); button47.addActionListener( this ); button47.buttonID = "47" ;
        button48 = new GameButton() ; button48.setBounds(200, 400, 50, 50); button48.setBackground(Color.WHITE); button48.addActionListener( this ); button48.buttonID = "48" ;
        button49 = new GameButton() ; button49.setBounds(200, 450, 50, 50); button49.setBackground(Color.WHITE); button49.addActionListener( this ); button49.buttonID = "49" ;
     
        button51 = new GameButton() ; button51.setBounds(250, 50, 50, 50); button51.setBackground(Color.WHITE); button51.addActionListener( this ); button51.buttonID = "51" ;
        button52 = new GameButton() ; button52.setBounds(250, 100, 50, 50); button52.setBackground(Color.WHITE); button52.addActionListener( this ); button52.buttonID = "52" ;
        button53 = new GameButton() ; button53.setBounds(250, 150, 50, 50); button53.setBackground(Color.WHITE); button53.addActionListener( this ); button53.buttonID = "53" ;
        button54 = new GameButton() ; button54.setBounds(250, 200, 50, 50); button54.setBackground(Color.WHITE); button54.addActionListener( this ); button54.buttonID = "54" ;
        button55 = new GameButton() ; button55.setBounds(250, 250, 50, 50); button55.setBackground(Color.WHITE); button55.addActionListener( this ); button55.buttonID = "55" ;
        button56 = new GameButton() ; button56.setBounds(250, 300, 50, 50); button56.setBackground(Color.WHITE); button56.addActionListener( this ); button56.buttonID = "56" ;
        button57 = new GameButton() ; button57.setBounds(250, 350, 50, 50); button57.setBackground(Color.WHITE); button57.addActionListener( this ); button57.buttonID = "57" ;
        button58 = new GameButton() ; button58.setBounds(250, 400, 50, 50); button58.setBackground(Color.WHITE); button58.addActionListener( this ); button58.buttonID = "58" ;
        button59 = new GameButton() ; button59.setBounds(250, 450, 50, 50); button59.setBackground(Color.WHITE); button59.addActionListener( this ); button59.buttonID = "59" ;
     
        button61 = new GameButton() ; button61.setBounds(300, 50, 50, 50); button61.setBackground(Color.WHITE); button61.addActionListener( this ); button61.buttonID = "61" ;
        button62 = new GameButton() ; button62.setBounds(300, 100, 50, 50); button62.setBackground(Color.WHITE); button62.addActionListener( this ); button62.buttonID = "62" ;
        button63 = new GameButton() ; button63.setBounds(300, 150, 50, 50); button63.setBackground(Color.WHITE); button63.addActionListener( this ); button63.buttonID = "63" ;
        button64 = new GameButton() ; button64.setBounds(300, 200, 50, 50); button64.setBackground(Color.WHITE); button64.addActionListener( this ); button64.buttonID = "64" ;
        button65 = new GameButton() ; button65.setBounds(300, 250, 50, 50); button65.setBackground(Color.WHITE); button65.addActionListener( this ); button65.buttonID = "65" ;
        button66 = new GameButton() ; button66.setBounds(300, 300, 50, 50); button66.setBackground(Color.WHITE); button66.addActionListener( this ); button66.buttonID = "66" ;
        button67 = new GameButton() ; button67.setBounds(300, 350, 50, 50); button67.setBackground(Color.WHITE); button67.addActionListener( this ); button67.buttonID = "67" ;
        button68 = new GameButton() ; button68.setBounds(300, 400, 50, 50); button68.setBackground(Color.WHITE); button68.addActionListener( this ); button68.buttonID = "68" ;
        button69 = new GameButton() ; button69.setBounds(300, 450, 50, 50); button69.setBackground(Color.WHITE); button69.addActionListener( this ); button69.buttonID = "69" ;
     
        button71 = new GameButton() ; button71.setBounds(350, 50, 50, 50); button71.setBackground(Color.WHITE); button71.addActionListener( this ); button71.buttonID = "71" ;
        button72 = new GameButton() ; button72.setBounds(350, 100, 50, 50); button72.setBackground(Color.WHITE); button72.addActionListener( this ); button72.buttonID = "72" ;
        button73 = new GameButton() ; button73.setBounds(350, 150, 50, 50); button73.setBackground(Color.WHITE); button73.addActionListener( this ); button73.buttonID = "73" ;
        button74 = new GameButton() ; button74.setBounds(350, 200, 50, 50); button74.setBackground(Color.WHITE); button74.addActionListener( this ); button74.buttonID = "74" ;
        button75 = new GameButton() ; button75.setBounds(350, 250, 50, 50); button75.setBackground(Color.WHITE); button75.addActionListener( this ); button75.buttonID = "75" ;
        button76 = new GameButton() ; button76.setBounds(350, 300, 50, 50); button76.setBackground(Color.WHITE); button76.addActionListener( this ); button76.buttonID = "76" ;
        button77 = new GameButton() ; button77.setBounds(350, 350, 50, 50); button77.setBackground(Color.WHITE); button77.addActionListener( this ); button77.buttonID = "77" ;
        button78 = new GameButton() ; button78.setBounds(350, 400, 50, 50); button78.setBackground(Color.WHITE); button78.addActionListener( this ); button78.buttonID = "78" ;
        button79 = new GameButton() ; button79.setBounds(350, 450, 50, 50); button79.setBackground(Color.WHITE); button79.addActionListener( this ); button79.buttonID = "79" ;
     
        button81 = new GameButton() ; button81.setBounds(400, 50, 50, 50); button81.setBackground(Color.WHITE); button81.addActionListener( this ); button81.buttonID = "81" ;
        button82 = new GameButton() ; button82.setBounds(400, 100, 50, 50); button82.setBackground(Color.WHITE); button82.addActionListener( this ); button82.buttonID = "82" ;
        button83 = new GameButton() ; button83.setBounds(400, 150, 50, 50); button83.setBackground(Color.WHITE); button83.addActionListener( this ); button83.buttonID = "83" ;
        button84 = new GameButton() ; button84.setBounds(400, 200, 50, 50); button84.setBackground(Color.WHITE); button84.addActionListener( this ); button84.buttonID = "84" ;
        button85 = new GameButton() ; button85.setBounds(400, 250, 50, 50); button85.setBackground(Color.WHITE); button85.addActionListener( this ); button85.buttonID = "85" ;
        button86 = new GameButton() ; button86.setBounds(400, 300, 50, 50); button86.setBackground(Color.WHITE); button86.addActionListener( this ); button86.buttonID = "86" ;
        button87 = new GameButton() ; button87.setBounds(400, 350, 50, 50); button87.setBackground(Color.WHITE); button87.addActionListener( this ); button87.buttonID = "87" ;
        button88 = new GameButton() ; button88.setBounds(400, 400, 50, 50); button88.setBackground(Color.WHITE); button88.addActionListener( this ); button88.buttonID = "88" ;
        button89 = new GameButton() ; button89.setBounds(400, 450, 50, 50); button89.setBackground(Color.WHITE); button89.addActionListener( this ); button89.buttonID = "89" ;
     
        button91 = new GameButton() ; button91.setBounds(450, 50, 50, 50); button91.setBackground(Color.WHITE); button91.addActionListener( this ); button91.buttonID = "91" ;
        button92 = new GameButton() ; button92.setBounds(450, 100, 50, 50); button92.setBackground(Color.WHITE); button92.addActionListener( this ); button92.buttonID = "92" ;
        button93 = new GameButton() ; button93.setBounds(450, 150, 50, 50); button93.setBackground(Color.WHITE); button93.addActionListener( this ); button93.buttonID = "93" ;
        button94 = new GameButton() ; button94.setBounds(450, 200, 50, 50); button94.setBackground(Color.WHITE); button94.addActionListener( this ); button94.buttonID = "94" ;
        button95 = new GameButton() ; button95.setBounds(450, 250, 50, 50); button95.setBackground(Color.WHITE); button95.addActionListener( this ); button95.buttonID = "95" ;
        button96 = new GameButton() ; button96.setBounds(450, 300, 50, 50); button96.setBackground(Color.WHITE); button96.addActionListener( this ); button96.buttonID = "96" ;
        button97 = new GameButton() ; button97.setBounds(450, 350, 50, 50); button97.setBackground(Color.WHITE); button97.addActionListener( this ); button97.buttonID = "97" ;
        button98 = new GameButton() ; button98.setBounds(450, 400, 50, 50); button98.setBackground(Color.WHITE); button98.addActionListener( this ); button98.buttonID = "98" ;
        button99 = new GameButton() ; button99.setBounds(450, 450, 50, 50); button99.setBackground(Color.WHITE); button99.addActionListener( this ); button99.buttonID = "99" ;
     
        buttons = new GameButton[] {
            button11 ,button12 ,button13 ,button14 ,button15 ,button16 ,button17 ,button18 ,button19 ,
            button21 ,button22 ,button23 ,button24 ,button25 ,button26 ,button27 ,button28 ,button29 ,
            button31 ,button32 ,button33 ,button34 ,button35 ,button36 ,button37 ,button38 ,button39 ,
            button41 ,button42 ,button43 ,button44 ,button45 ,button46 ,button47 ,button48 ,button49 ,
            button51 ,button52 ,button53 ,button54 ,button55 ,button56 ,button57 ,button58 ,button59 ,
            button61 ,button62 ,button63 ,button64 ,button65 ,button66 ,button67 ,button68 ,button69 ,
            button71 ,button72 ,button73 ,button74 ,button75 ,button76 ,button77 ,button78 ,button79 ,
            button81 ,button82 ,button83 ,button84 ,button85 ,button86 ,button87 ,button88 ,button89 ,
            button91 ,button92 ,button93 ,button94 ,button95 ,button96 ,button97 ,button98 ,button99 } ;

        // endregion
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setResizable(false);
        
        textField = new JTextField() ;        
        textField.setBounds(240,550, 160,30);  
        
        gameLog = new JTextField() ;        
        gameLog.setBounds(110,720, 292,40);  

        SetCurrentLog( " " );
        currentSelectedButton = null ;

        JLabel out_label = new JLabel("Game Log");
        out_label.setBounds(220,690, 280,40);

        GameButton buttonIN = new GameButton() ; buttonIN.setBounds(110, 550, 80, 30); buttonIN.setBackground(Color.WHITE); buttonIN.addActionListener( this ); buttonIN.buttonID = "IN" ;
        GameButton buttonSL = new GameButton() ; buttonSL.setBounds(110, 600, 80, 30); buttonSL.setBackground(Color.WHITE); buttonSL.addActionListener( this ); buttonSL.buttonID = "SLV" ;
        GameButton buttonGN = new GameButton() ; buttonGN.setBounds(240, 600, 160, 30); buttonGN.setBackground(Color.WHITE); buttonGN.addActionListener( this ); buttonGN.buttonID = "GEN" ;
        
        GameButton buttonRS = new GameButton() ; buttonRS.setBounds(110, 650, 80, 30); buttonRS.setBackground(Color.WHITE); buttonRS.addActionListener( this ); buttonRS.buttonID = "RES" ;
        GameButton buttonEX = new GameButton() ; buttonEX.setBounds(240, 650, 160, 30); buttonEX.setBackground(Color.WHITE); buttonEX.addActionListener( this ); buttonEX.buttonID = "EXIT" ;

        this.setTitle("Sudoku Sudoku Sudoku Sudoku !");
        this.setSize(570,850);
        this.setVisible(true);
        
        buttonIN.setText("Input");
        buttonSL.setText("Solve");
        buttonGN.setText("Generate");
        buttonRS.setText("Reset");
        buttonEX.setText("Give up");
            
        // region ADD ELEMENTS

        // ADDING ALL THE BUTTONS TO THE GUI 
        // refer "Assets/codeGenerator.ipynb" for code
        this.add(c00) ;this.add(c01) ;this.add(c10) ;this.add(c11) ;this.add( theme ) ;
        
        this.add( buttonIN ) ;this.add( buttonGN ) ;this.add( buttonSL ) ;this.add( buttonRS ) ;this.add( buttonEX ) ;
        this.add( button11 ) ;this.add( button12 ) ;this.add( button13 ) ;this.add( button14 ) ;this.add( button15 ) ;this.add( button16 ) ;this.add( button17 ) ;this.add( button18 ) ;this.add( button19 ) ;
        this.add( button21 ) ;this.add( button22 ) ;this.add( button23 ) ;this.add( button24 ) ;this.add( button25 ) ;this.add( button26 ) ;this.add( button27 ) ;this.add( button28 ) ;this.add( button29 ) ;
        this.add( button31 ) ;this.add( button32 ) ;this.add( button33 ) ;this.add( button34 ) ;this.add( button35 ) ;this.add( button36 ) ;this.add( button37 ) ;this.add( button38 ) ;this.add( button39 ) ;
        this.add( button41 ) ;this.add( button42 ) ;this.add( button43 ) ;this.add( button44 ) ;this.add( button45 ) ;this.add( button46 ) ;this.add( button47 ) ;this.add( button48 ) ;this.add( button49 ) ;
        this.add( button51 ) ;this.add( button52 ) ;this.add( button53 ) ;this.add( button54 ) ;this.add( button55 ) ;this.add( button56 ) ;this.add( button57 ) ;this.add( button58 ) ;this.add( button59 ) ;
        this.add( button61 ) ;this.add( button62 ) ;this.add( button63 ) ;this.add( button64 ) ;this.add( button65 ) ;this.add( button66 ) ;this.add( button67 ) ;this.add( button68 ) ;this.add( button69 ) ;
        this.add( button71 ) ;this.add( button72 ) ;this.add( button73 ) ;this.add( button74 ) ;this.add( button75 ) ;this.add( button76 ) ;this.add( button77 ) ;this.add( button78 ) ;this.add( button79 ) ;
        this.add( button81 ) ;this.add( button82 ) ;this.add( button83 ) ;this.add( button84 ) ;this.add( button85 ) ;this.add( button86 ) ;this.add( button87 ) ;this.add( button88 ) ;this.add( button89 ) ;
        this.add( button91 ) ;this.add( button92 ) ;this.add( button93 ) ;this.add( button94 ) ;this.add( button95 ) ;this.add( button96 ) ;this.add( button97 ) ;this.add( button98 ) ;this.add( button99 ) ;
        
        SetTheme( themes[comboBox.getSelectedIndex()] );

        this.add( comboBox ) ;
        this.add( out_label ) ;
        this.add( textField ) ;
        this.add( gameLog ) ;

        // endregion
    }

    public void actionPerformed( ActionEvent event ) {

        if( event.getSource() == comboBox ) {   
            //System.out.println("event fired");
            SetTheme( themes[comboBox.getSelectedIndex()] );
            SetCurrentLog( "change theme to \"" + themes[comboBox.getSelectedIndex()] + "\"" );
            
            return ;
        } 

        GameButton event_source ;
        try { event_source = (GameButton) event.getSource() ; }
        catch( Exception err ) { return ; }

        if ( event_source.buttonID == "IN" ) {

            String input = textField.getText() ;
            int number ;

            try {

                number =  Integer.parseInt( input.strip() ) ;

                SetButtonValue(currentSelectedButton.buttonID , number );

                return ;
            }

            catch( Exception err ) {

                SetCurrentLog( "Parsing error" );
            }
        }

        if ( event_source.buttonID == "SLV" ) {

            int N = sudo_array.length;
 
            if (SolveSudoku(sudo_array, N))
            {
                // print solution
                DisplayBoard();
            }
            else {
                
                System.out.println("No solution");
                SetCurrentLog("No Solution, Recheck board ?");
            }
        }

        // System.out.println( event_source.buttonID );

        try {

            if ( currentSelectedButton != event_source ) {

                int coord ;

                coord = Integer.parseInt( event_source.buttonID ) ; 
                
                currentSelectedButton = event_source ;
                SetCurrentLog( "select " + currentSelectedButton.buttonID );
            }

            else if ( GetCurrentLog().split(" ")[0] == "select" ) {
            
                if( currentSelectedButton.buttonID == GetCurrentLog().split(" ")[1] 
                && event_source.buttonID == currentSelectedButton.buttonID ) {
    
                    currentSelectedButton = null ;
                    SetCurrentLog( "deselect " + event_source.buttonID ) ;
                }
            }
        }

        catch( Exception err ) { SetCurrentLog( "Sync Error" ); } 
    }

    // SET THEME METHOD SETS THEME TO A SPECIFIC THEME FROM A CONSTANT ARRAY "themes" 
    // WHICH IS BASICALLY SWITCHING BACKGROUND COLORS 
    void SetTheme( String theme ) {

        // SWITCH CASE FOR THEME CHANGING
        // WHERE "0xRRGGBB" IS RGB HEX CODE FOR COLORS
        switch (theme) {
            case "Charcoal" :
                
                this.getContentPane().setBackground( new Color( 0x424242 ) );
                break;
            
            case "Nuke" :
                
                this.getContentPane().setBackground( new Color( 0xffffff ) );
                break;
            
            case "Ocean" :
                
                this.getContentPane().setBackground( new Color( 0x21cbff ) );
                break;

            case "Cutie" :
    
                this.getContentPane().setBackground( new Color( 0xff6bbf ) );
                break;

            case "Vector" :
                
                this.getContentPane().setBackground( new Color( 0xff7452 ) );
                break;

            case "Lemon" :
                
                this.getContentPane().setBackground( new Color( 0xd7ff52 ) );
                break;

            default:
                break;
        }
    }

    // GET CURRENT LOG GETS THE CURRENT GAME LOG THAT IS BEING DISPLAYED IN THE LOG FIELD
    String GetCurrentLog( ) { 

        return gameLog.getText() ;
    }

    // SETLOG METHOD SETS GAME LOG TO A STRING SO THAT THE THING IS DISPALYED IN THE LOG FIELD 
    void SetCurrentLog( String log ) { 
        
        gameLog.setText( null );
        gameLog.setText( log ); 
    }

    // GET BUTTON WITH TAG RETURNS THE BUTTON WITH ITS UNIQUE ID
    GameButton GetGameButtonWithTag ( String tag  ) {
        
        GameButton temp ;

        for (GameButton gameButton : buttons) {
            
            if( gameButton.buttonID == tag ) {

                temp = gameButton ; 
                return temp ;
            }
        }

        return null ;
    }

    // UPDATE METHOD SYNCS BETWEEN GUI AND MAIN ARRAY sudo_array 

    // GET BUTTON VALUE RETURNS THE VALUE OF A BUTTON WITH A SPECIFIC UNIQUE ID 
    int GetButtonValue( String tag ) {

        return GetGameButtonWithTag( tag ).value ;
    }

    // DISPLAY 2D INT BOARD ARRAY sudo_board IN CONSOLE
    void DisplayBoard( ) {

        for (int[] row : sudo_array) {
            
            System.out.println( Arrays.toString( row ) );
        }
    }

    // SET BUTTON VALUE FINDS A BUTTON WITH ITS UNIQUE TAG 
    // AND SETS THE BUTTON VALUE AND SPRITE TO THE INPUT VALUE FROM THE INPUT FIELD
    void SetButtonValue( String tag, int value ) {

        try {

            String valStr ;

            if( value != 0 ) { valStr = Integer.toString( value ) ; } 
            else { valStr = "  " ; }

            GetGameButtonWithTag( tag ).setText( valStr );
            GetGameButtonWithTag( tag ).value = value ;

            double id = (double) Integer.parseInt( tag ) ;
            int x , y ;

            x = (int) ( ( ( ( id / 10 ) - Math.floor ( id / 10 ) ) * 10 ) - 1 )  ;
            // 41             4.1           4         4.1       

            y = (int)( (Math.floor( id / 10 )) ) - 1 ;

            sudo_array[x][y] = value ;

            SetCurrentLog( "Edited button " + tag + " " + valStr );

            DisplayBoard();
        }

        catch( Exception err ) {

            SetCurrentLog( err.getMessage() );
        }
    }

    // IS SAFE CHECKS IF A NUMBER IS IN A 3X3 BOX, ROW OR COLUMN AND RETURNS TRUE IF SAFE AND FALSE IF NOT SAFE
    public static boolean isSafe(int[][] board,int row, int col,int num)
    {

        for (int d = 0; d < board.length; d++) {
             
            if (board[row][d] == num) {

                return false;
            }
        }
 
        for (int r = 0; r < board.length; r++) {
             
            if (board[r][col] == num) {

                return false;
            }
        }
 
        int sqrt = (int)Math.sqrt(board.length);
        int boxRowStart = row - row % sqrt;
        int boxColStart = col - col % sqrt;
 
        for (int r = boxRowStart; r < boxRowStart + sqrt; r++) {

            for (int d = boxColStart; d < boxColStart + sqrt; d++) {

                if (board[r][d] == num) { return false; }
            }
        }
 
        return true;
    }

    void Update() {

        for (int i = 0; i < 9; i++) {
            
            for (int j = 0; j < 9; j++) {
                
                int buttonID = j * 10 + i ;

                int val =  GetGameButtonWithTag( Integer.toString( buttonID ) ).value ;
                
                sudo_array[i][j] = val ;
            }
        }
    }

    // SolveSudoku RECURSIVELY CHECKS IF A NUMBER CAN BE PLACED IN A PLACE IF THE PLACE IS A
    // SAFE PLACE OR NOT    
    boolean SolveSudoku( int[][] sudo_board, int n ) {

        Update();
     
        int row = -1;
        int col = -1;
        boolean isEmpty = true;
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {

                if (sudo_board[i][j] == 0) {

                    row = i;
                    col = j;
 
                    isEmpty = false;
                    break;
                }
            }

            if (!isEmpty) {
            
                break;
            }
        }
 
        if (isEmpty) {

            return true;
        }

        for (int num = 1; num <= n; num++) {

            if (isSafe(sudo_board, row, col, num)) {

                String id = String.valueOf( col + ( row * 10 ) ) ;

                if (SolveSudoku(sudo_board, n)) {

                    return true;
                }
                else {
                    
                    sudo_board[row][col] = 0;
                }
            }
        }
        return false;
    }
    
    // DO I WANT THESE ACTUALLY HMMMMM ?
    void Sudoku2Arr( ) {


    }

    void GenerateSudoku() {


    }

    void SetButtonNumber() {


    }
}
