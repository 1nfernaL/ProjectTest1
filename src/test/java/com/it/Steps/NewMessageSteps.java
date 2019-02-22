package com.it.Steps;

import com.it.Pages.NewMessagePage;
import com.it.Utils.Utils;

public class NewMessageSteps extends NewMessagePage {
    public void sendMessage() {
        sendMessage(Utils.Data.getValidEmail(), Utils.Data.getRandomSubject(), Utils.Data.getRandomTextBody());
    }
}
