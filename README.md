
# 🍲 Recipe App (Day 9+) -- MVVM + Retrofit + Jetpack Compose + Navigation

This is an **enhanced Recipe Categories App** built using **MVVM
architecture**, **Retrofit**, and **Jetpack Compose**.\
It fetches categories from [TheMealDB API](https://www.themealdb.com/),
shows them in a grid, and supports **navigation between multiple
screens**.

------------------------------------------------------------------------

## 📱 Features

-   ✅ **MVVM Architecture** with `ViewModel`
-   ✅ API integration using **Retrofit**
-   ✅ Image loading with **Coil**
-   ✅ Modern UI built with **Jetpack Compose**
-   ✅ Handles **Loading / Error / Success** states
-   ✅ **Grid layout** with category thumbnails
-   ✅ **Navigation support** -- multiple screens
-   ✅ Clean UI + State Management with Compose

------------------------------------------------------------------------

## 🛠️ Tech Stack

-   **Language:** Kotlin\
-   **UI Framework:** Jetpack Compose\
-   **Architecture:** MVVM (Model-View-ViewModel)\
-   **Networking:** Retrofit + Gson\
-   **Image Loading:** Coil\
-   **Async:** Coroutines (suspend functions)\
-   **State Management:** `mutableStateOf` + `State`\
-   **Navigation:** Jetpack Navigation Compose

------------------------------------------------------------------------

## 📂 Project Structure

    com.example.day_9
    │── MainActivity.kt        # Entry point of app
    │── MainViewModel.kt       # ViewModel (fetches data)
    │── RecipeScreen.kt        # UI Composable (main categories screen)
    │── Category.kt            # Data models
    │
    └── ui.theme
        │── ApiService.kt      # Retrofit setup + API interface

------------------------------------------------------------------------

## 🚀 How It Works

1.  **Retrofit** fetches categories from\
    `https://www.themealdb.com/api/json/v1/1/categories.php`
2.  Response is mapped into `Category` & `CategoriesResponse`
3.  **ViewModel** fetches data via `viewModelScope.launch`
4.  UI observes **state (`loading`, `success`, `error`)**
5.  **LazyVerticalGrid** shows category images + names
6.  Clicking a category → navigates to details screen

------------------------------------------------------------------------

## 📸 Screenshots

![Categories
Screen](https://github.com/user-attachments/assets/22d29ffe-f174-4d21-b2cd-ab4af801028d)\
![Navigation
Example](https://github.com/user-attachments/assets/32dec066-09bd-4e09-8dd6-050f6cff45fc)\
![WhatsApp Image 2025-08-22 at 21 34 08_bd138a55](https://github.com/user-attachments/assets/13176f2c-c483-4692-8aee-65c516c76344)


------------------------------------------------------------------------

## 🔧 Installation & Setup

1.  Clone the repo

    ``` bash
    git clone https://github.com/rameshwar-p001/Android_Recipe_App.git
    ```

2.  Open in **Android Studio**\

3.  Add Internet Permission in `AndroidManifest.xml`

    ``` xml
    <uses-permission android:name="android.permission.INTERNET"/>
    ```

4.  Run the app 🚀

------------------------------------------------------------------------

## 📌 Future Enhancements

🔹 Add **detailed recipe screen** with full instructions\
🔹 Implement **search functionality**\
🔹 Add **favorites with Room Database**\
🔹 Dark Mode support

------------------------------------------------------------------------

## 👨‍💻 Author

Developed by **Rameshwar Digambar Patil** ✨
