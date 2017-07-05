
import org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper;
import org.socialforce.app.Application;
import org.socialforce.app.ApplicationListener;
import org.socialforce.app.Applications.ApplicationForMutidoor;
import org.socialforce.app.Console.TextOutputMain;
import org.socialforce.app.gui.ApplicationMain;
import org.socialforce.scene.Scene;
import org.socialforce.geom.impl.Circle2D;
import org.socialforce.geom.impl.Point2D;
import org.socialforce.model.Agent;

import javax.swing.*;
import java.awt.*;

import static org.socialforce.app.gui.SimulationPanelMain.frame;

/**
 * Created by Whatever on 2016/10/22.
 */
public class Main{
    public static void main(String[] args) {
        try {
            BeautyEyeLNFHelper.launchBeautyEyeLNF();
            UIManager.put("RootPane.setupButtonVisible",false);
        } catch (Exception e) {
        }
        try {
            //JFrame frame = new JFrame("SimulationPanelMain");
            frame = new JFrame("Epimetheus");
            //SimulationPanelMain mainPanel = new SimulationPanelMain();
            ApplicationMain mainPanel = new ApplicationMain();
            mainPanel.getLoader().add(new ApplicationForNeuralModel());
            /*Application application = new ApplicationForDoorTest();//应用在这里！
            application.setApplicationListener(mainPanel);*/
            //mainPanel.setLoader(new ApplicationLoader(mainPanel));
            frame.setContentPane(mainPanel.demoP);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            //frame.setResizable(false);
            frame.pack();
            frame.setVisible(true);

            //application.start();
        } catch (HeadlessException e) {
            System.out.println("GUI Not Supported on this machine.");
        }
    }


}