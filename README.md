# Flags
- The app displays a list of flags and generates a random list when refreshed.
### Features
- [LazyVerticalGrid](https://developer.android.com/reference/kotlin/androidx/compose/foundation/lazy/grid/package-summary#LazyVerticalGrid(androidx.compose.foundation.lazy.grid.GridCells,androidx.compose.ui.Modifier,androidx.compose.foundation.lazy.grid.LazyGridState,androidx.compose.foundation.layout.PaddingValues,kotlin.Boolean,androidx.compose.foundation.layout.Arrangement.Vertical,androidx.compose.foundation.layout.Arrangement.Horizontal,androidx.compose.foundation.gestures.FlingBehavior,kotlin.Boolean,kotlin.Function1))
- Animated Item Placement 
### How The Code Works
- For simplicity purposes, there are 2 packages, `data` and `ui`.
#### 1. Data
- This contains the `model` of how each flag item is and the `dummydata` which contains the list of flags. Note that the data source is locally fetched.
#### 2. UI
- This contains the screen to be displayed,i.e `FlagList` which is presented as a LazyVerticalGrid. It contains the `FlagItem`.
- The `components` are the [ViewModel](https://developer.android.com/topic/libraries/architecture/viewmodel) and `FlagListState` .
- The ViewModel is used to manage the screen logic of displaying the screen.
- It maintains the state of the list despite the configurations. It is the only source of data for the [composables](https://developer.android.com/jetpack/compose/mental-model#:~:text=Composable%20functions%20can%20accept%20parameters,creates%20the%20text%20UI%20element.).
- The FlagListState is used to store state needed to observe in the application.

### Appetize Link
- Interact with the app live [here](https://appetize.io/app/sl3zlazrvgrn6hxfah3j6alway?device=pixel4&osVersion=11.0&scale=75)

