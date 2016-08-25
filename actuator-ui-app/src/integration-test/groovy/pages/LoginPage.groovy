package pages

import geb.Page
import modules.LoginModule

class LoginPage extends Page {
    static url = "/sample/login/auth"

    static at = { title == "Login" }

    static content = {
        loginModule { module LoginModule }
    }
}
