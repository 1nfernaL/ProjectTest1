package com.it;

import com.it.Pages.NewMessagePage;
import com.it.Steps.*;

public class App {
    public CommonSteps common;
    public LoginSteps login;
    public DashBoardSteps dashBoard;
    public NewMessageSteps newMessage;
    public SuccessSendStatusSteps sendStatus;
    public LastMessageSteps lastMessage;

    public App() {
        common = new CommonSteps();
        login = new LoginSteps();
        dashBoard = new DashBoardSteps();
        newMessage = new NewMessageSteps();
        sendStatus = new SuccessSendStatusSteps();
        lastMessage = new LastMessageSteps();
    }
}
