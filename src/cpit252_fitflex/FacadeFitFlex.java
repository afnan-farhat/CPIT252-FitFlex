package cpit252_fitflex;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class FacadeFitFlex extends JFrame {

    static Scanner scanner = new Scanner(System.in);
    static double MemberShipFee;
    static JTextArea textArea = new JTextArea();

    public static void welcome() {

        JFrame myFrame = new JFrame("Start");

        // Set size of JFrame
        myFrame.setSize(960, 540);

        // Set default close operation
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a JLabel with an ImageIcon
        ImageIcon backgroundImage = new ImageIcon("C:\\Users\\Afnan\\Documents\\NetBeansProjects\\CPIT252\\CPIT252_PROJECT\\CPIT252_FitFlex\\CPIT252_FitFlex\\1.png");
        JLabel backgroundLabel = new JLabel(backgroundImage);

        // Set layout of JFrame to null to position components manually
        myFrame.setLayout(null);

        // Set bounds of backgroundLabel to cover the entire JFrame
        backgroundLabel.setBounds(0, 0, myFrame.getWidth(), myFrame.getHeight());

        // Add backgroundLabel to the content pane of the JFrame
        myFrame.getContentPane().add(backgroundLabel);

        // Create a JButton
        JButton startButton = new JButton("Let's Start");

        // Set bounds of the button
        startButton.setBounds(380, 429, 200, 45); // Adjust the position and size as needed

        // Add ActionListener to the button
        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Perform action when the button is clicked
                start();
            }
        });

        // Add button to the content pane of the JFrame
        myFrame.getContentPane().add(startButton);

        // Ensure the button is in front of the background label
        myFrame.getContentPane().setComponentZOrder(startButton, 0);

        // Make JFrame visible
        myFrame.setVisible(true);

    }

    public static void start() {

        // Main Application
        // Singleton Pattern: Configuration Manager
        ConfigurationManager configManager = ConfigurationManager.getInstance();

        // User Input: Opening Hours
        System.out.println("=== Gym Configuration ===");

        int OpeningHours = configManager.getOpeningHours();
        MemberShipFee = configManager.getMembershipFee();
        System.out.println("Current Opening Hours: " + OpeningHours + " starts from 8:00 AM");
        System.out.println("Current Membership Fee: " + MemberShipFee);

        signInAs(MemberShipFee, OpeningHours, configManager);

    }

    public static void signInAs(double MemberShipFee, int OpeningHours, ConfigurationManager configManager) {

        JFrame pymentFrame = new JFrame("Sign in");

        // Set size of JFrame
        pymentFrame.setSize(960, 540);

        // Set default close operation
        pymentFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a JLabel with an ImageIcon
        ImageIcon backgroundImage = new ImageIcon("C:\\Users\\Afnan\\Documents\\NetBeansProjects\\CPIT252\\CPIT252_PROJECT\\CPIT252_FitFlex\\CPIT252_FitFlex\\4.png");
        JLabel backgroundLabel = new JLabel(backgroundImage);

        // Set layout of JFrame to null to position components manually
        pymentFrame.setLayout(null);

        // Set bounds of backgroundLabel to cover the entire JFrame
        backgroundLabel.setBounds(0, 0, pymentFrame.getWidth(), pymentFrame.getHeight());

        // Add backgroundLabel to the content pane of the JFrame
        pymentFrame.getContentPane().add(backgroundLabel);

        // Create a JButton
        JButton user = new JButton("User");
        JButton manager = new JButton("Manager");

        // Set bounds of the button
        user.setBounds(600, 380, 150, 45); // Adjust the position and size as needed
        manager.setBounds(200, 380, 150, 45); // Adjust the position and size as needed

        // Add ActionListener to the button
        user.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Perform action when the button is clicked
                System.out.println("================ User View ================");
                User();
            }
        });

        manager.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Perform action when the button is clicked
                System.out.println("============== Manager View ===============");
                Manager(OpeningHours, configManager, scanner);
            }
        });

        // Add button to the content pane of the JFrame
        pymentFrame.getContentPane().add(user);
        pymentFrame.getContentPane().add(manager);

        // Ensure the button is in front of the background label
        pymentFrame.getContentPane().setComponentZOrder(user, 0);
        pymentFrame.getContentPane().setComponentZOrder(manager, 0);

        // Make JFrame visible
        pymentFrame.setVisible(true);

    }

    
    // ================================= User =================================
    public static void User() {

        JFrame UserFrame = new JFrame("User");

        // Set size of JFrame
        UserFrame.setSize(960, 540);

        // Set default close operation
        UserFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a JLabel with an ImageIcon
        ImageIcon backgroundImage = new ImageIcon("C:\\Users\\Afnan\\Documents\\NetBeansProjects\\CPIT252\\CPIT252_PROJECT\\CPIT252_FitFlex\\CPIT252_FitFlex\\5.png");
        JLabel backgroundLabel = new JLabel(backgroundImage);

        // Set layout of JFrame to null to position components manually
        UserFrame.setLayout(null);

        // Set bounds of backgroundLabel to cover the entire JFrame
        backgroundLabel.setBounds(0, 0, UserFrame.getWidth(), UserFrame.getHeight());

        // Add backgroundLabel to the content pane of the JFrame
        UserFrame.getContentPane().add(backgroundLabel);

        // Create a JButton
        JButton workOut = new JButton("Workout Plan");
        JButton membership = new JButton("Membership");
        JButton LogOut = new JButton("Log out");

        // Set bounds of the button
        workOut.setBounds(590, 420, 200, 45); // Adjust the position and size as needed
        membership.setBounds(180, 420, 200, 45); // Adjust the position and size as needed
        LogOut.setBounds(740, 65, 100, 35);

        // Add ActionListener to the button
        membership.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Decorator Pattern: Membership Tiers
                membership();
            }
        });

        workOut.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Factory Method Pattern: Workout Plan Generator
                workoutPlan();
            }
        });

        LogOut.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Factory Method Pattern: Workout Plan Generator
                System.exit(0);
            }
        });

        // Add button to the content pane of the JFrame
        UserFrame.getContentPane().add(membership);
        UserFrame.getContentPane().add(workOut);
        UserFrame.getContentPane().add(LogOut);

        // Ensure the button is in front of the background label
        UserFrame.getContentPane().setComponentZOrder(membership, 0);
        UserFrame.getContentPane().setComponentZOrder(workOut, 0);
        UserFrame.getContentPane().setComponentZOrder(LogOut, 0);

        // Make JFrame visible
        UserFrame.setVisible(true);

    }

    public static void membership() {

        // Decorator Pattern: Membership Tiers
        System.out.println("=== Membership ===");
        Membership basicMembership = new BasicMembership(); // Basic Membership Only

        JFrame MembershipFrame = new JFrame("User");

        // Set size of JFrame
        MembershipFrame.setSize(960, 540);

        // Set default close operation
        MembershipFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a JLabel with an ImageIcon
        ImageIcon backgroundImage = new ImageIcon("C:\\Users\\Afnan\\Documents\\NetBeansProjects\\CPIT252\\CPIT252_PROJECT\\CPIT252_FitFlex\\CPIT252_FitFlex\\6.png");
        JLabel backgroundLabel = new JLabel(backgroundImage);

        // Set layout of JFrame to null to position components manually
        MembershipFrame.setLayout(null);

        // Set bounds of backgroundLabel to cover the entire JFrame
        backgroundLabel.setBounds(0, 0, MembershipFrame.getWidth(), MembershipFrame.getHeight());

        // Add backgroundLabel to the content pane of the JFrame
        MembershipFrame.getContentPane().add(backgroundLabel);

        // Create a JButton
        JButton Basic = new JButton("Basic");
        JButton Premium = new JButton("Premium");

        // Set bounds of the button
        Basic.setBounds(190, 400, 200, 45); // Adjust the position and size as needed
        Premium.setBounds(590, 400, 200, 45); // Adjust the position and size as needed

        // Add ActionListener to the button
        Basic.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Perform action when the button is clicked
                System.out.println("Basic Membership Details:");
                basicMembership.getInfo();

                // Strategy Pattern: Payment Processing
                payment();
            }
        });

        Premium.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Perform action when the button is clicked
                Membership premiumMembership = new PremiumMembership(basicMembership);
                System.out.println("\nPremium Membership Details:");
                premiumMembership.getInfo();
                MemberShipFee *= 2;

                // Strategy Pattern: Payment Processing
                payment();
            }
        });

        // Add button to the content pane of the JFrame
        MembershipFrame.getContentPane().add(Premium);
        MembershipFrame.getContentPane().add(Basic);

        // Ensure the button is in front of the background label
        MembershipFrame.getContentPane().setComponentZOrder(Premium, 0);
        MembershipFrame.getContentPane().setComponentZOrder(Basic, 0);

        // Make JFrame visible
        MembershipFrame.setVisible(true);

    }

    public static void payment() {

        System.out.println("\n=== Payment Method ===");
        JFrame pymentFrame = new JFrame("Payment");

        // Set size of JFrame
        pymentFrame.setSize(960, 540);

        // Set default close operation
        pymentFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a JLabel with an ImageIcon
        ImageIcon backgroundImage = new ImageIcon("C:\\Users\\Afnan\\Documents\\NetBeansProjects\\CPIT252\\CPIT252_PROJECT\\CPIT252_FitFlex\\CPIT252_FitFlex\\2.png");
        JLabel backgroundLabel = new JLabel(backgroundImage);

        // Set layout of JFrame to null to position components manually
        pymentFrame.setLayout(null);

        // Set bounds of backgroundLabel to cover the entire JFrame
        backgroundLabel.setBounds(0, 0, pymentFrame.getWidth(), pymentFrame.getHeight());

        // Add backgroundLabel to the content pane of the JFrame
        pymentFrame.getContentPane().add(backgroundLabel);

        // Create a JButton
        JButton CreditCard = new JButton("CreditCard");
        JButton ApplePay = new JButton("ApplePay");
        JButton stcPay = new JButton("stcPay");
        JButton Tamara = new JButton("Tamara");

        // Set bounds of the button
        CreditCard.setBounds(160, 260, 200, 45); // Adjust the position and size as needed
        ApplePay.setBounds(160, 400, 200, 45); // Adjust the position and size as needed
        stcPay.setBounds(590, 260, 200, 45); // Adjust the position and size as needed
        Tamara.setBounds(590, 400, 200, 45); // Adjust the position and size as needed

        // Add ActionListener to the button
        CreditCard.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Perform action when the button is clicked
                PaymentStrategy paymentStrategy = new CreditCardPayment();
                successfulPayment(paymentStrategy.pay(MemberShipFee));
            }
        });

        ApplePay.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Perform action when the button is clicked
                PaymentStrategy paymentStrategy = new ApplePayPayment();
                successfulPayment(paymentStrategy.pay(MemberShipFee));
            }
        });

        stcPay.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Perform action when the button is clicked
                PaymentStrategy paymentStrategy = new StcPayPayment();
                successfulPayment(paymentStrategy.pay(MemberShipFee));
            }
        });

        Tamara.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Perform action when the button is clicked
                PaymentStrategy paymentStrategy = new TamaraPayment();
                successfulPayment(paymentStrategy.pay(MemberShipFee));
            }
        });

        // Add button to the content pane of the JFrame
        pymentFrame.getContentPane().add(CreditCard);
        pymentFrame.getContentPane().add(ApplePay);
        pymentFrame.getContentPane().add(stcPay);
        pymentFrame.getContentPane().add(Tamara);

        // Ensure the button is in front of the background label
        pymentFrame.getContentPane().setComponentZOrder(CreditCard, 0);
        pymentFrame.getContentPane().setComponentZOrder(ApplePay, 0);
        pymentFrame.getContentPane().setComponentZOrder(stcPay, 0);
        pymentFrame.getContentPane().setComponentZOrder(Tamara, 0);

        // Make JFrame visible
        pymentFrame.setVisible(true);

    }

    public static void successfulPayment(String massage) {

        JFrame successfulPaymentFrame = new JFrame("successfulPayment");

        // Set size of JFrame
        successfulPaymentFrame.setSize(960, 540);

        // Set default close operation
        successfulPaymentFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a JLabel with an ImageIcon
        ImageIcon backgroundImage = new ImageIcon("C:\\Users\\Afnan\\Documents\\NetBeansProjects\\CPIT252\\CPIT252_PROJECT\\CPIT252_FitFlex\\CPIT252_FitFlex\\3.png");
        JLabel backgroundLabel = new JLabel(backgroundImage);

        // Set layout of JFrame to null to position components manually
        successfulPaymentFrame.setLayout(null);

        // Set bounds of backgroundLabel to cover the entire JFrame
        backgroundLabel.setBounds(0, 0, successfulPaymentFrame.getWidth(), successfulPaymentFrame.getHeight());

        // Add backgroundLabel to the content pane of the JFrame
        successfulPaymentFrame.getContentPane().add(backgroundLabel);

        // Create a JTextArea and set its text
        textArea.setText("          " + massage);

        // Set font size and style
        Font font = new Font("Times New Roman", Font.PLAIN, 20); // Change the font name and size as needed
        textArea.setFont(font);

        // Optionally, configure the JTextArea
        textArea.setEditable(false); // Make it non-editable
        textArea.setLineWrap(false); // Enable line wrapping
        textArea.setWrapStyleWord(true); // Wrap at word boundaries

        // Create a JScrollPane to hold the JTextArea
        JScrollPane scrollPane = new JScrollPane(textArea);

        // Add the JScrollPane to the JFrame's content pane
        successfulPaymentFrame.getContentPane().add(scrollPane);
        scrollPane.setBounds(300, 290, 350, 40);

        // Create a JButton
        JButton Done = new JButton("Done");

        // Set bounds of the button
        Done.setBounds(380, 420, 200, 45); // Adjust the position and size as needed

        // Add ActionListener to the button
        Done.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Perform action when the button is clicked
                User();
            }
        });

        // Add button to the content pane of the JFrame
        successfulPaymentFrame.getContentPane().add(Done);

        // Ensure the button is in front of the background label
        successfulPaymentFrame.getContentPane().setComponentZOrder(Done, 0);
        successfulPaymentFrame.getContentPane().setComponentZOrder(scrollPane, 0);

        // Make JFrame visible
        successfulPaymentFrame.setVisible(true);

    }

    public static void workoutPlan() {

        // Factory 
        System.out.println(
                "\n=== Workout Plan ===");
        System.out.print(
                "Workout plan type (Strength, Cardio, Resistance) \n");

        JFrame WorkoutFrame = new JFrame("Workout Plan");

        // Set size of JFrame
        WorkoutFrame.setSize(960, 540);

        // Set default close operation
        WorkoutFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a JLabel with an ImageIcon
        ImageIcon backgroundImage = new ImageIcon("C:\\Users\\Afnan\\Documents\\NetBeansProjects\\CPIT252\\CPIT252_PROJECT\\CPIT252_FitFlex\\CPIT252_FitFlex\\7.png");
        JLabel backgroundLabel = new JLabel(backgroundImage);

        // Set layout of JFrame to null to position components manually
        WorkoutFrame.setLayout(null);

        // Set bounds of backgroundLabel to cover the entire JFrame
        backgroundLabel.setBounds(0, 0, WorkoutFrame.getWidth(), WorkoutFrame.getHeight());

        // Add backgroundLabel to the content pane of the JFrame
        WorkoutFrame.getContentPane().add(backgroundLabel);

        // Create a JButton
        JButton Cardio = new JButton("Cardio");
        JButton Strength = new JButton("Strength");
        JButton Resistance = new JButton("Resistance");
        JButton Back = new JButton("Back");

        // Set bounds of the button
        Cardio.setBounds(230, 240, 125, 45); // Adjust the position and size as needed
        Strength.setBounds(45, 240, 125, 45); // Adjust the position and size as needed
        Resistance.setBounds(230, 420, 125, 45); // Adjust the position and size as needed
        Back.setBounds(45, 420, 125, 45);

        textArea.setText("");

        // Add ActionListener to the button
        Cardio.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Perform action when the button is clicked
                WorkoutPlanFactory planGenerator = new WorkoutPlanFactory();
                WorkoutPlan workoutPlan = planGenerator.generateWorkoutPlan("Cardio");
                textArea.setText(workoutPlan.generatePlan());
            }
        });

        Strength.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Perform action when the button is clicked
                WorkoutPlanFactory planGenerator = new WorkoutPlanFactory();
                WorkoutPlan workoutPlan = planGenerator.generateWorkoutPlan("Strength");
                textArea.setText(workoutPlan.generatePlan());
            }
        });

        Resistance.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Perform action when the button is clicked
                WorkoutPlanFactory planGenerator = new WorkoutPlanFactory();
                WorkoutPlan workoutPlan = planGenerator.generateWorkoutPlan("Resistance");
                textArea.setText(workoutPlan.generatePlan());
            }
        });

        Back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Perform action when the button is clicked
                User();
            }
        });

        // Set font size and style
        Font font = new Font("Times New Roman", Font.PLAIN, 16); // Change the font name and size as needed
        textArea.setFont(font);

        // Optionally, configure the JTextArea
        textArea.setEditable(false); // Make it non-editable
        textArea.setLineWrap(false); // Enable line wrapping
        textArea.setWrapStyleWord(true); // Wrap at word boundaries

        // Create a JScrollPane to hold the JTextArea
        JScrollPane scrollPane = new JScrollPane(textArea);

        // Add the JScrollPane to the JFrame's content pane
        WorkoutFrame.getContentPane().add(scrollPane);
        scrollPane.setBounds(470, 100, 420, 370);

        // Add button to the content pane of the JFrame
        WorkoutFrame.getContentPane().add(Cardio);
        WorkoutFrame.getContentPane().add(Strength);
        WorkoutFrame.getContentPane().add(Resistance);
        WorkoutFrame.getContentPane().add(Back);

        // Ensure the button is in front of the background label
        WorkoutFrame.getContentPane().setComponentZOrder(Cardio, 0);
        WorkoutFrame.getContentPane().setComponentZOrder(Strength, 0);
        WorkoutFrame.getContentPane().setComponentZOrder(Resistance, 0);
        WorkoutFrame.getContentPane().setComponentZOrder(Back, 0);
        WorkoutFrame.getContentPane().setComponentZOrder(scrollPane, 0);

        // Make JFrame visible
        WorkoutFrame.setVisible(true);

    }
    
    // ================================ Manager ================================
    public static void showMenu() {
        System.out.println("|-----------------------------------------------|");
        System.out.println("|------       Welcome FitFlex (Menu)      ------|");
        System.out.println("|-----------------------------------------------|");
        System.out.println("|   1. Modify on Opening Hours                  |");
        System.out.println("|   2. Modify on Membership Fee                 |");
        System.out.println("|   3. Send Notification                        |");
        System.out.println("|   8. Quit                                     |");
        System.out.println("|-----------------------------------------------|");
        System.out.println();
        System.out.print("> Please enter your choice: ");
    }

    public static void OpeninedHours(int OpeningHours, ConfigurationManager configManager) {
        System.out.print("Enter new opening hours: ");
        OpeningHours = scanner.nextInt();
        configManager.setOpeningHours(OpeningHours);
        System.out.println("New Opening Hours: " + OpeningHours);

    }

    public static void MembershipFee(double MemberShipFee, ConfigurationManager configManager) {
        System.out.print("Enter new membership fee: ");
        MemberShipFee = scanner.nextDouble();
        configManager.setMembershipFee(MemberShipFee);
        System.out.println("New Membership Fee: " + MemberShipFee);
    }

    public static void Notification() {
        Scanner scanner = new Scanner(System.in);
        // Observer Pattern: Notification System
        System.out.println("\n=== Notification System ===");
        NotificationSystem notificationSystem = new NotificationSystem();

        Coaches member1 = new Coaches("John", notificationSystem);
        Trainee member2 = new Trainee("Alice", notificationSystem);

        try {
            System.out.print("Enter notification message: ");
            String notificationMessage = scanner.nextLine();

            notificationSystem.notifyObservers(notificationMessage);
        } catch (Exception e) {
            System.err.println("An error occurred while processing the notification message: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public static void Manager(int OpeningHours, ConfigurationManager configManager, Scanner sc) {

        while (true) {
            showMenu();

            int choice = sc.nextInt();

            // Modify on opening hours
            if (choice == 1) {
                OpeninedHours(OpeningHours, configManager);

            } // Modify on membership fee
            else if (choice == 2) {
                MembershipFee(MemberShipFee, configManager);

            } // Notification
            else if (choice == 3) {
                Notification();

            } // Exit the app
            else if (choice == 4) {
                System.out.println(">    Goodbye!");
                System.out.println();
                break;
            } // Wrong choice
            else {
                throw new IllegalArgumentException("Invalid Request");
            }
        }
    }


}
