package com.example.jetpackcomposeinitial.navigation

const val DETAILS_ARG_ID_KEY = "id"
const val DETAILS_ARG_NAME_KEY = "name"

sealed class Screen(val route: String) {
    object Home : Screen(route = "home_screen/{$DETAILS_ARG_ID_KEY}")

    object Details : Screen(route = "details_screen?id={id}&name={name}") {
        /*Pass single params */
//        fun passIntValue(id: Int): String {
//            return this.route.replace(oldValue = "{$DETAILS_ARG_ID_KEY}", newValue = id.toString())
//        }

        /*Pass multiple params */
        fun passIntAndStringValue(id: Int, name: String): String {
            return "details_screen/$id/$name"
        }

        /*Pass single optional params */
        fun PassOptionalIntParam(id: Int = 0): String {
            return "details_screen?id=$id"
        }

        /*Pass multi optional params */
        fun PassMultiOptionalParams(id: Int = 0, name: String = ""): String {
            return "details_screen?id=$id&name=$name"
        }
    }
}
