package pe.paku.eventapp.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Search
import androidx.navigation.compose.rememberNavController
import pe.paku.eventapp.R
import pe.paku.eventapp.commons.Constants
import pe.paku.eventapp.presentation.navigation.BottomNavigationBar
import pe.paku.eventapp.presentation.navigation.Navigation
import pe.paku.eventapp.presentation.ui.theme.EventAppTheme

class MainActivity : ComponentActivity() {
    @ExperimentalMaterialApi
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            EventAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    val navController = rememberNavController()
                    Scaffold(
                        bottomBar = {
                            BottomNavigationBar(
                                items = listOf(
                                    BottomNavItem(
                                        name = getString(R.string.BOTTOM_NAV_HOME),
                                        route = Constants.PATH_HOME_SCREEN,
                                        icon = Icons.Default.Home
                                    ),
                                    BottomNavItem(
                                        name = getString(R.string.BOTTOM_NAV_SEARCH),
                                        route = Constants.PATH_SEARCH_SCREEN,
                                        icon = Icons.Default.Search
                                    ),
                                    BottomNavItem(
                                        name = getString(R.string.BOTTOM_NAV_PROFILE),
                                        route = Constants.PATH_PROFILE_SCREEN,
                                        icon = Icons.Default.Face,
                                        badgeCount = 23
                                    )
                                ),
                                navController = navController,
                                onItemClick = {
                                    navController.navigate(it.route)
                                }
                            )
                        }
                    ) {
                        Navigation(navController = navController)
                    }
                }
            }
        }
    }
}


