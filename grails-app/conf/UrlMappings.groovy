class UrlMappings {

	static mappings = {
		"/$controller/$action?/$id?"{
			constraints {
				// apply constraints here
			}
		}
        "/error"(view:'/error')

		"/"(controller: 'person', action:'home')
		"500"(view:'/error')
	}
}
