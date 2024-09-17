/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gui;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.Action;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.KeyStroke;

/**
 *
 * @author MSI_PC
 */
public class JNotePad extends JFrame{
    
    
    private JMenuBar mBar;
    private JMenu mFile,mEdit,mFormat,mHelp,mView,mZoom;
    private JMenuItem itemNew,itemOpen,itemSave,itemSaveAs,itemPageSetup,itemPrint,itemExit;
    private JMenuItem itemUndo,itemCut,itemCopy,itemPaste,itemDelete,itemSearchWithBing,itemFind,itemFindNext,itemFindPevious,itemReplace,itemGoto,itemSelectAll,itemDatetime;
    private JMenuItem itemViewHelp,itemSendFeedback,itemAboutNotepad;
    private JMenuItem itemFont,itemZoomIn,itemZoomOut,itemRestoreDefaultZoom;
    private JCheckBoxMenuItem itemWrap,itemStatusbar;
    private JTextArea txtEditor;
    
    private JNotePad(String title){
        super(title);
        setSize(700, 500);
        CreateMenu();
        CreateGui();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    private void CreateMenu() {
        //tạo thành thực đơn
        mBar=new JMenuBar();
        //Tạo thực đơn File và add vào thanh thực đơn
        mBar.add(mFile=new JMenu("File"));
        //tạo thực đơn Edit và add vào thanh thực đơn
        mBar.add(mEdit=new JMenu("Edit"));
        //tạo thực đơn Edit và add vào thanh thực đơn
        mBar.add(mFormat=new JMenu("Format"));
        //tạo thực đơn View và add vào thanh thực đơn
        mBar.add(mView=new JMenu("View"));
        //tạo thực đơn Help và add vào thanh thực đơn
        mBar.add(mHelp=new JMenu("Help"));
        
        
        
        //tạo item và add vào menu File
        mFile.add(itemNew=new JMenuItem("New"));
        mFile.add(itemOpen=new JMenuItem("Open"));
        mFile.add(itemSave=new JMenuItem("Save"));
        mFile.add(itemSaveAs=new JMenuItem("Save As..."));
        mFile.addSeparator();
        mFile.add(itemPageSetup=new JMenuItem("Page Setup..."));
        mFile.add(itemPrint=new JMenuItem("Print"));
        mFile.addSeparator();
        mFile.add(itemExit=new JMenuItem("Exit"));
        //tạo item và add vào menu Edit
        mEdit.add(itemUndo=new JMenuItem("UnDo"));
        mEdit.addSeparator();
        mEdit.add(itemCut=new JMenuItem("Cut"));
        mEdit.add(itemCopy=new JMenuItem("Coppy"));
        mEdit.add(itemPaste=new JMenuItem("Paste"));
        mEdit.add(itemDelete=new JMenuItem("Delete"));
        mEdit.addSeparator();
        mEdit.add(itemSearchWithBing=new JMenuItem("Search With Bing"));
        mEdit.add(itemFind=new JMenuItem("Find"));
        mEdit.add(itemFindNext=new JMenuItem("Find Next"));
        mEdit.add(itemFindPevious=new JMenuItem("Find Previous"));
        mEdit.add(itemReplace=new JMenuItem("Replace..."));
        mEdit.add(itemGoto=new JMenuItem("Go to..."));
        mEdit.addSeparator();
        mEdit.add(itemSelectAll=new JMenuItem("Select All"));
        mEdit.add(itemDatetime=new JMenuItem("Time/Date"));
        
        //tạo item và add vào menu Format
        mFormat.add(itemWrap=new JCheckBoxMenuItem("Word Wrap",true));
        mFormat.add(itemFont=new JMenuItem("Font"));
        //tạo item và add vào menu View
        mView.add(mZoom=new JMenu("Zoom"));
        mView.add(itemStatusbar=new JCheckBoxMenuItem("Status Bar",true));
        mZoom.add(itemZoomIn=new JMenuItem("Zoom In"));
        mZoom.add(itemZoomOut=new JMenuItem("Zoom Out"));
        mZoom.add(itemRestoreDefaultZoom=new JMenuItem("Restore Default Zoom"));
        
         mFile.add(itemExit=new JMenuItem("Exit"));
        //tạo item và add vào menu Help
        mHelp.add(itemViewHelp=new JMenuItem("View Help"));
        mHelp.add(itemSendFeedback=new JMenuItem("Send Feedback"));
        mHelp.addSeparator();
        mHelp.add(itemAboutNotepad=new JMenuItem("About NotePad"));
        
        
        
        //Tạo tổ hợp phím nóng cho item
        
        itemNew.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N,KeyEvent.CTRL_DOWN_MASK));
        itemOpen.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O,KeyEvent.CTRL_DOWN_MASK));
        itemSave.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S,KeyEvent.CTRL_DOWN_MASK));
        itemSaveAs.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S,KeyEvent.CTRL_DOWN_MASK+KeyEvent.SHIFT_DOWN_MASK));
        itemExit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_W,KeyEvent.CTRL_DOWN_MASK));
        itemZoomIn.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_PLUS,KeyEvent.CTRL_DOWN_MASK));
        itemZoomOut.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_MINUS,KeyEvent.CTRL_DOWN_MASK));
        itemRestoreDefaultZoom.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_0,KeyEvent.CTRL_DOWN_MASK));
        itemUndo.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Z,KeyEvent.CTRL_DOWN_MASK));
        itemCut.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X,KeyEvent.CTRL_DOWN_MASK));
        itemCopy.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C,KeyEvent.CTRL_DOWN_MASK));
        itemPaste.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V,KeyEvent.CTRL_DOWN_MASK));
        itemDelete.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_DELETE,KeyEvent.CTRL_DOWN_MASK));
        itemSearchWithBing.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E,KeyEvent.CTRL_DOWN_MASK));
        itemFind.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F,KeyEvent.CTRL_DOWN_MASK));
        itemFindNext.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F3, 0));
        itemFindPevious.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F3,KeyEvent.SHIFT_DOWN_MASK));
        itemReplace.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_H,KeyEvent.CTRL_DOWN_MASK));
        itemGoto.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_G,KeyEvent.CTRL_DOWN_MASK));
        itemSelectAll.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A,KeyEvent.CTRL_DOWN_MASK));
        itemDatetime.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F5, 0));
        itemPrint.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P,KeyEvent.CTRL_DOWN_MASK));
        //gắn thực đơn vào cửa sổ
        setJMenuBar(mBar);
        
        //tiếp nhận sự kiện cho itemExit
        
        itemExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(JOptionPane.showConfirmDialog(null, "Are you sure to exit?")==JOptionPane.YES_OPTION){
                    System.exit(0);
                }
            }
        });
        
    }
    public static void main(String[] args) {
        JNotePad notepad=new JNotePad("Demo Notepad");
        notepad.setVisible(true);
    }

    private void CreateGui() {
        txtEditor=new JTextArea();
        JScrollPane scrollEditor=new JScrollPane(txtEditor);
        add(scrollEditor);
        txtEditor.setFont(new Font("Arial",Font.PLAIN,22));
    }
    
    }
    

