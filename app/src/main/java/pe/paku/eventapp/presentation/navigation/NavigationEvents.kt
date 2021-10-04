package pe.paku.eventapp.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import pe.paku.eventapp.commons.Constants
import pe.paku.eventapp.presentation.home.HomeScreen
import pe.paku.eventapp.presentation.profile.ProfileScreen
import pe.paku.eventapp.presentation.search.SearchScreen

@Composable
fun Navigation(navController: NavHostController){
    NavHost(navController = navController, startDestination = "HOME" ){
        composable(Constants.PATH_HOME_SCREEN){
            HomeScreen()
        }
        composable(Constants.PATH_SEARCH_SCREEN){
            SearchScreen()
        }
        composable(Constants.PATH_PROFILE_SCREEN){
            ProfileScreen()
        }
    }
}