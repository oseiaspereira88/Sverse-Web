package sverseweb

class UrlMappings {

    static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

        "/"(view:"/bloco_de_notas")
        "500"(view:'/error')
        "404"(view:'/notFound')
    }
}
