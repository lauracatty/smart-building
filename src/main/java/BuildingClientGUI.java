import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BuildingClientGUI {
    private JFrame frame;
    private JTextField areaIdTextField;
    private JTextField intensityTextField;
    private JTextArea outputTextArea;
    private JButton modifyButton;
    // Add more components as needed

    // Add the gRPC client classes here
    // For example:
    // private BuildingServiceGrpc.BuildingServiceBlockingStub climateControlStub;

    public BuildingClientGUI() {
        initialize();
    }

    private void initialize() {
        frame = new JFrame("Building Client GUI");
        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());

        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new GridLayout(2, 2));

        JLabel areaIdLabel = new JLabel("Area ID:");
        areaIdTextField = new JTextField(10);

        JLabel intensityLabel = new JLabel("Intensity:");
        intensityTextField = new JTextField(10);

        modifyButton = new JButton("Modify Light Intensity");
        modifyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                modifyLightIntensity();
            }
        });

        // Add more components and action listeners for other service calls

        inputPanel.add(areaIdLabel);
        inputPanel.add(areaIdTextField);
        inputPanel.add(intensityLabel);
        inputPanel.add(intensityTextField);

        mainPanel.add(inputPanel, BorderLayout.NORTH);

        outputTextArea = new JTextArea(10, 40);
        outputTextArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(outputTextArea);

        mainPanel.add(scrollPane, BorderLayout.CENTER);

        frame.add(mainPanel);
        frame.setVisible(true);
    }

    private void modifyLightIntensity() {
        String areaId = areaIdTextField.getText();
        int intensity = Integer.parseInt(intensityTextField.getText());

        // TODO: Implement gRPC call to modify light intensity
        // For example:
        // ModifyLightIntensityRequest request = ModifyLightIntensityRequest.newBuilder()
        //         .setAreaId(areaId)
        //         .setIntensity(intensity)
        //         .build();
        // ModifyLightIntensityResponse response = climateControlStub.modifyLightIntensity(request);

        // TODO: Display the response in the outputTextArea
        // outputTextArea.append("Light intensity modification was successful: " + response.getSuccess() + "\n");
    }

    // Add methods to implement other service calls here

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new BuildingClientGUI();
            }
        });
    }
}

