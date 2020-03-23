import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


public class MainFX extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        //先写一个登陆窗口
        int identity = login();
    }

    private int login(){
        
        Stage stage = new Stage();

        Label l_name = new Label("用户名:");
        Label l_password = new Label("密码:");
        //两个输入框
        TextField p_name = new TextField();
        PasswordField p_password = new PasswordField();
        //两个按钮
        Button clear = new Button("清除");
        Button logining = new Button("登陆");

        p_name.setUserData("tom");//设置一个默认值作为默认的用户名
        p_password.setUserData("mima12345");//设置一个初始化的密码



        GridPane gr = new GridPane();//采用网格布局
        gr.setStyle("-fx-background-color:pink");
        Scene scene = new Scene(gr);
        gr.setAlignment(Pos.CENTER);

        gr.add(l_name,0,0);
        gr.add(p_name,1,0);
        gr.add(l_password,0,1);
        gr.add(p_password,1,1);
        gr.add(clear,0,2);
        gr.add(logining,1,2);
        gr.setHgap(5);
        gr.setVgap(15);

        GridPane.setMargin(logining,new Insets(0,0,0,150));
//        GridPane.setMargin(clear, new Insets(0, 0, 0, 30));


        stage.setScene(scene);

        p_name.setTooltip(new Tooltip("请输入用户名"));
        p_password.setTooltip(new Tooltip("请输入密码"));

        stage.setHeight(300);
        stage.setWidth(500);
        stage.setTitle("登陆窗口");
        stage.setResizable(false);
        stage.show();
        
        return 0;
    }
}
