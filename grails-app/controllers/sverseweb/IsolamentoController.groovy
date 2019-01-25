package sverseweb

class IsolamentoController {

    def login() {
        render(view: "/isolamento/login")
    }
    def logout() {
        render(view: "/isolamento//login")
    }
    def error() {
        render(view: "/isolamento/error")
    }
}
