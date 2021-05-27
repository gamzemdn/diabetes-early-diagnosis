package testowlprj;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;


public class FormFrame extends javax.swing.JFrame {

    OntologyFunctions obj = new OntologyFunctions();
  //  public static String konum;
  //   public static      String balance;         
   //   public static     String hesapturu;
   //    public static    String hesapdurumu;
    public FormFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tc = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        ADDBTN = new javax.swing.JButton();
        EXITBTN = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        GESTDIA = new javax.swing.JComboBox();
        HBP = new javax.swing.JComboBox();
        waisttxt = new javax.swing.JTextField();
        agetxt = new javax.swing.JTextField();
        heighttxt = new javax.swing.JTextField();
        weighttxt = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        FAMILYDIA = new javax.swing.JComboBox();
        jLabel23 = new javax.swing.JLabel();
        EXERCISE = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        adsoyad = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        tcno = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tc.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tc.setText("TC");
        tc.setMaximumSize(new java.awt.Dimension(300, 40));
        tc.setMinimumSize(new java.awt.Dimension(300, 40));
        tc.setPreferredSize(new java.awt.Dimension(300, 40));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel17.setText("WAIST");
        jLabel17.setMaximumSize(new java.awt.Dimension(300, 40));
        jLabel17.setMinimumSize(new java.awt.Dimension(300, 40));
        jLabel17.setPreferredSize(new java.awt.Dimension(300, 40));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel18.setText("WEIGHT");
        jLabel18.setMaximumSize(new java.awt.Dimension(300, 40));
        jLabel18.setMinimumSize(new java.awt.Dimension(300, 40));
        jLabel18.setPreferredSize(new java.awt.Dimension(300, 40));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel19.setText("EXERCISE?");
        jLabel19.setMaximumSize(new java.awt.Dimension(300, 40));
        jLabel19.setMinimumSize(new java.awt.Dimension(300, 40));
        jLabel19.setPreferredSize(new java.awt.Dimension(300, 40));

        ADDBTN.setBackground(new java.awt.Color(255, 255, 255));
        ADDBTN.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        ADDBTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/user_add.png"))); // NOI18N
        ADDBTN.setBorderPainted(false);
        ADDBTN.setContentAreaFilled(false);
        ADDBTN.setDefaultCapable(false);
        ADDBTN.setMaximumSize(new java.awt.Dimension(300, 75));
        ADDBTN.setMinimumSize(new java.awt.Dimension(300, 75));
        ADDBTN.setPreferredSize(new java.awt.Dimension(300, 75));
        ADDBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ADDBTNActionPerformed(evt);
            }
        });

        EXITBTN.setBackground(new java.awt.Color(255, 255, 255));
        EXITBTN.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        EXITBTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/exit.png"))); // NOI18N
        EXITBTN.setBorderPainted(false);
        EXITBTN.setContentAreaFilled(false);
        EXITBTN.setDefaultCapable(false);
        EXITBTN.setMaximumSize(new java.awt.Dimension(300, 75));
        EXITBTN.setMinimumSize(new java.awt.Dimension(300, 75));
        EXITBTN.setPreferredSize(new java.awt.Dimension(300, 75));
        EXITBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EXITBTNActionPerformed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel20.setText("HEIGHT");
        jLabel20.setMaximumSize(new java.awt.Dimension(300, 40));
        jLabel20.setMinimumSize(new java.awt.Dimension(300, 40));
        jLabel20.setPreferredSize(new java.awt.Dimension(300, 40));

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel21.setText("HAD GESTATIONAL DIABETES?");
        jLabel21.setMaximumSize(new java.awt.Dimension(300, 40));
        jLabel21.setMinimumSize(new java.awt.Dimension(300, 40));
        jLabel21.setPreferredSize(new java.awt.Dimension(300, 40));

        GESTDIA.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        GESTDIA.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "YES", "NO" }));
        GESTDIA.setMaximumSize(new java.awt.Dimension(300, 40));
        GESTDIA.setMinimumSize(new java.awt.Dimension(300, 40));
        GESTDIA.setPreferredSize(new java.awt.Dimension(300, 40));
        GESTDIA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GESTDIAActionPerformed(evt);
            }
        });

        HBP.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        HBP.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "YES", "NO" }));
        HBP.setMaximumSize(new java.awt.Dimension(300, 40));
        HBP.setMinimumSize(new java.awt.Dimension(300, 40));
        HBP.setPreferredSize(new java.awt.Dimension(300, 40));
        HBP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HBPActionPerformed(evt);
            }
        });

        waisttxt.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        waisttxt.setMaximumSize(new java.awt.Dimension(300, 40));
        waisttxt.setMinimumSize(new java.awt.Dimension(300, 40));
        waisttxt.setPreferredSize(new java.awt.Dimension(300, 40));

        agetxt.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        agetxt.setMaximumSize(new java.awt.Dimension(300, 40));
        agetxt.setMinimumSize(new java.awt.Dimension(300, 40));
        agetxt.setPreferredSize(new java.awt.Dimension(300, 40));

        heighttxt.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        heighttxt.setMaximumSize(new java.awt.Dimension(300, 40));
        heighttxt.setMinimumSize(new java.awt.Dimension(300, 40));
        heighttxt.setPreferredSize(new java.awt.Dimension(300, 40));

        weighttxt.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        weighttxt.setMaximumSize(new java.awt.Dimension(300, 40));
        weighttxt.setMinimumSize(new java.awt.Dimension(300, 40));
        weighttxt.setPreferredSize(new java.awt.Dimension(300, 40));

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel22.setText("PARENTS HAD DIABETES?");
        jLabel22.setMaximumSize(new java.awt.Dimension(300, 40));
        jLabel22.setMinimumSize(new java.awt.Dimension(300, 40));
        jLabel22.setPreferredSize(new java.awt.Dimension(300, 40));

        FAMILYDIA.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        FAMILYDIA.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "YES", "NO" }));
        FAMILYDIA.setMaximumSize(new java.awt.Dimension(300, 40));
        FAMILYDIA.setMinimumSize(new java.awt.Dimension(300, 40));
        FAMILYDIA.setPreferredSize(new java.awt.Dimension(300, 40));
        FAMILYDIA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FAMILYDIAActionPerformed(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel23.setText("HAD HIGH BLOOD PRESSURE?");
        jLabel23.setMaximumSize(new java.awt.Dimension(300, 40));
        jLabel23.setMinimumSize(new java.awt.Dimension(300, 40));
        jLabel23.setPreferredSize(new java.awt.Dimension(300, 40));

        EXERCISE.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        EXERCISE.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "YES", "NO" }));
        EXERCISE.setMaximumSize(new java.awt.Dimension(300, 40));
        EXERCISE.setMinimumSize(new java.awt.Dimension(300, 40));
        EXERCISE.setPreferredSize(new java.awt.Dimension(300, 40));
        EXERCISE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EXERCISEActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("PLEASE FILL THE FORM BELOW");

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel30.setText("AD SOYAD");
        jLabel30.setMaximumSize(new java.awt.Dimension(300, 40));
        jLabel30.setMinimumSize(new java.awt.Dimension(300, 40));
        jLabel30.setPreferredSize(new java.awt.Dimension(300, 40));

        adsoyad.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        adsoyad.setMaximumSize(new java.awt.Dimension(300, 40));
        adsoyad.setMinimumSize(new java.awt.Dimension(300, 40));
        adsoyad.setPreferredSize(new java.awt.Dimension(300, 40));

        jLabel31.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel31.setText("AGE");
        jLabel31.setMaximumSize(new java.awt.Dimension(300, 40));
        jLabel31.setMinimumSize(new java.awt.Dimension(300, 40));
        jLabel31.setPreferredSize(new java.awt.Dimension(300, 40));

        tcno.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tcno.setMaximumSize(new java.awt.Dimension(300, 40));
        tcno.setMinimumSize(new java.awt.Dimension(300, 40));
        tcno.setPreferredSize(new java.awt.Dimension(300, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(10, 10, 10)
                            .addComponent(HBP, 0, 0, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(FAMILYDIA, 0, 0, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(GESTDIA, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(heighttxt, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(waisttxt, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(weighttxt, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(agetxt, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(EXERCISE, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ADDBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(EXITBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tc, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(adsoyad, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                .addComponent(tcno, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tcno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adsoyad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(agetxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(waisttxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(weighttxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(heighttxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(GESTDIA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(FAMILYDIA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(HBP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(EXERCISE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ADDBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EXITBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ADDBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ADDBTNActionPerformed

       

 Connection con=null;
         String url="jdbc:derby://localhost:1527/";
        String dbname="customerdatabase";
        String driver="org.apache.derby.jdbc.ClientDriver";
        String uName="gamzem";
        String uPass="12345";
        
        double diabetes_probability=0.0,prediabetes_probability=0.0,low_probability=0.0;
        
        String ad=adsoyad.getText().trim();
        String tc = tcno.getText().trim();
        int age = Integer.parseInt(agetxt.getText().trim());
        double waist = Double.parseDouble(waisttxt.getText().trim());
        double weight = Double.parseDouble(weighttxt.getText().trim());
        double height = Double.parseDouble(heighttxt.getText().trim());
        String gest = GESTDIA.getSelectedItem().toString();
        String family = FAMILYDIA.getSelectedItem().toString();
        String hbp = HBP.getSelectedItem().toString();
        String exercise = EXERCISE.getSelectedItem().toString();
        
if(diabetes_probability>0.08){


//diabetes

}
    if(prediabetes_probability>0.29 && diabetes_probability<=0.025){
    
   //prediabetes
    
    
    }    
    if(prediabetes_probability<=0.29 && diabetes_probability<0.01) {
    
    //low
    
    
    }
        if(age<=44){
       
        
        }
        
        else if(age>44 && age<=57){
        
        
        
        }
        else if(age>57){
        
        
        
        
        }
         try {          
            obj.saveClassAssertion("PERSON", tc);
            obj.SaveDTPString(tc, "HAS_NAME_SURNAME", ad);    
            obj.SaveDTPInteger(tc, "HAS_AGE", age);
            obj.SaveDTPDouble(tc, "HAS_HEIGHT", height);
            obj.SaveDTPDouble(tc, "HAS_WEIGHT", weight);
            obj.SaveDTPDouble(tc, "HAS_WAIST", waist);     
            obj.SAVEOTP(tc, "HAS_GEST", gest);
            obj.SAVEOTP(tc, "HAS_EXERCISE", exercise);
            obj.SAVEOTP(tc, "HAS_HBP", hbp);
            obj.SAVEOTP(tc, "HAS_PARENT", family);
            
            JOptionPane.showMessageDialog(null, "DONE" );
           // JOptionPane.showMessageDialog(null, obj.getAnObjectProperty(tc, "HAS_RECOMMEND") );
          // JOptionPane.showMessageDialog(null, obj.getAnObjectProperty(tc, "HAS_SYMPTOMS") );
         
            List<String> list = new ArrayList<String>();
             list=obj.getAnObjectProperty(tc, "HAS_SYMPTOMS");
          
             
              
            
              
            final  Symptoms s=new Symptoms();
             s.jTextField1.setText(obj.getAnObjectProperty(tc, "HAS_RECOMMEND").toString());
             // String words="";
               final DefaultListModel fruitsName = new DefaultListModel();
               int i=0;
            
               for(i=0;i<list.size();i++){
            fruitsName.addElement(list.get(i));
       //  System.out.println(fruitsName.get(i));
           //s.liste = new JList(arr);
           // s.jTextField1.setText(list.get(i));
            //list
   // System.out.println(obj.getAnnotation(list.get(i)));
      
           // words=words+ "\n"+s.jTextField1.getText();
            
            }
             s.jList1.setModel(fruitsName); 
             s.jList1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
             s.jList1.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {
                     String selectedValue = s.jList1.getSelectedValue().toString();
                  //   String parts[] = obj.getAnnotation(selectedValue).toString().split(",",2);
                   //  for (String part : parts) {
	   //s.jTextArea1.setText(part); 
	//}
                  s.jTextArea1.setText(obj.getAnnotation(selectedValue).toString());
           
                }
            }
        });
             
              // add(s.liste);
               
        
           
           
                    // = new JList<String>(fruitsName);

             // JPanel listPanel = new JPanel();
     // listPanel.add(new JScrollPane(s.jList1));
      // s.jList1 = new JList(fruitsName);
       //      add(new JScrollPane( s.jList1 ));
            //add(s.jList1);
           //  s.jList1.setVisible(true); 
            // s.liste.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
   //    s.liste.setSelectedIndex(0);
     //  s.liste.setVisibleRowCount(i);  
       //s.liste.setVisible(true);
        
              // s.jTextField1.setText(words);
            s.setVisible(true);
            
            
             // Class.forName(driver).newInstance();
       
      // con=DriverManager.getConnection(url+dbname,uName,uPass);
      //  Statement stmt = con.createStatement();
        
       // ResultSet rs = stmt.executeQuery("SELECT * FROM CUSTOMER");
        
      //  while (rs.next()) {
            
        // String s = rs.getString("KARTNO");          
         //String konum=rs.getString("KONUM");
        // String balance=rs.getString("BALANCE");         
       //  String hesapturu=rs.getString("HESAPTURU");
       //  String hesapdurumu=rs.getString("HESAPDURUMU");
        
           
           //  if(kartno.contains(s)){
               
               
            // }
           
       //}        
    //  con.close();
             
                       
       } 
     
        catch (Exception e) {
            System.out.println("Could not create ontology: " + e.getMessage());
        }
    }//GEN-LAST:event_ADDBTNActionPerformed

    private void EXITBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EXITBTNActionPerformed
        String tc = tcno.getText().trim();
        String ad = adsoyad.getText().trim();
        int age = Integer.parseInt(agetxt.getText().trim());
        double waist = Double.parseDouble(waisttxt.getText().trim());
         double height = Double.parseDouble(heighttxt.getText().trim());
          double weight = Double.parseDouble(weighttxt.getText().trim());
          String gest = GESTDIA.getSelectedItem().toString();
        String family = FAMILYDIA.getSelectedItem().toString();
        String hbp = HBP.getSelectedItem().toString();
        String exercise = EXERCISE.getSelectedItem().toString();
      //  Connection con=null;
        //   String url="jdbc:derby://localhost:1527/";
       // String dbname="customerdatabase";
       // String driver="org.apache.derby.jdbc.ClientDriver";
      //  String uName="gamzem";
      //  String uPass="12345";
      //GAMZE  String aktivite = AKTIVITECB.getSelectedItem().toString();
        // GAMZE String alerji = ALLERGYCB.getSelectedItem().toString();
        
        try {
//Class.forName(driver).newInstance();
            obj.removeDTPString(tc, "HAS_NAME_SURNAME", ad);
            obj.removeDTPInteger(tc, "HAS_AGE", age);
            obj.removeDTPDouble(tc, "HAS_HEIGHT", height);
            obj.removeDTPDouble(tc, "HAS_WEIGHT", weight);
            obj.removeDTPDouble(tc, "HAS_WAIST", waist); 
            obj.removeOTP(tc, "HAS_GEST", gest);
            obj.removeOTP(tc, "HAS_HBP", hbp);
            obj.removeOTP(tc, "HAS_PARENT", family);
            obj.removeOTP(tc, "HAS_EXERCISE", exercise);
              
             //con=DriverManager.getConnection(url+dbname,uName,uPass);
       // Statement stmt = con.createStatement();
        
      //  ResultSet rs = stmt.executeQuery("SELECT * FROM CUSTOMER");
        
       // while (rs.next()) {
        //   String s = rs.getString("KARTNO");
          
       
        //     if(kartno.contains(s)){
                 
        //         String   konum=rs.getString("KONUM");
        //String  balance=rs.getString("BALANCE");         
        //String   hesapturu=rs.getString("HESAPTURU");
        //String    hesapdurumu=rs.getString("HESAPDURUMU");
                 
                
                 
             //}
       // }
            obj.removeClassAssertion("PERSON", tc);

       JOptionPane.showMessageDialog(null, "CLEANED!!"); 
      // con.close();
        } 
        catch (Exception e) {
            System.out.println("Could not create ontology: " + e.getMessage());
        }
       
        System.exit(0);
    }//GEN-LAST:event_EXITBTNActionPerformed

    private void GESTDIAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GESTDIAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GESTDIAActionPerformed

    private void HBPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HBPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HBPActionPerformed

    private void FAMILYDIAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FAMILYDIAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FAMILYDIAActionPerformed

    private void EXERCISEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EXERCISEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EXERCISEActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ADDBTN;
    private javax.swing.JComboBox EXERCISE;
    private javax.swing.JButton EXITBTN;
    private javax.swing.JComboBox FAMILYDIA;
    private javax.swing.JComboBox GESTDIA;
    private javax.swing.JComboBox HBP;
    private javax.swing.JTextField adsoyad;
    private javax.swing.JTextField agetxt;
    private javax.swing.JTextField heighttxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel tc;
    private javax.swing.JTextField tcno;
    private javax.swing.JTextField waisttxt;
    private javax.swing.JTextField weighttxt;
    // End of variables declaration//GEN-END:variables
}
