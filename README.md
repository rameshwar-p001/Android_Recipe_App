# 🍲 Recipe App (Day 9) – MVVM + Retrofit + Jetpack Compose

This is a **Recipe Categories App** built using **MVVM architecture**, **Retrofit**, and **Jetpack Compose**.  
It fetches categories from [TheMealDB API](https://www.themealdb.com/) and displays them in a grid layout with images and names.  

---

## 📱 Features
- ✅ MVVM Architecture with `ViewModel`
- ✅ API integration using **Retrofit**
- ✅ Image loading with **Coil**
- ✅ Modern UI built with **Jetpack Compose**
- ✅ Handles loading state, error state, and success state
- ✅ Grid layout with category thumbnails

---

## 🛠️ Tech Stack
- **Language:** Kotlin
- **UI Framework:** Jetpack Compose
- **Architecture:** MVVM (Model-View-ViewModel)
- **Networking:** Retrofit + Gson
- **Image Loading:** Coil
- **Async:** Coroutines (suspend functions)
- **State Management:** `mutableStateOf` + `State`

---

## 📂 Project Structure
`com.example.day_9
│── MainActivity.kt # Entry point of app
│── MainViewModel.kt # ViewModel for business logic
│── RecipeScreen.kt # UI Composable functions
│── Category.kt # Data models
│
└── ui.theme
│── ApiService.kt # Retrofit setup and API interface`


---

## 🚀 How It Works
1. **Retrofit** calls `https://www.themealdb.com/api/json/v1/1/categories.php`  
2. Response is mapped into `Category` and `CategoriesResponse` data classes  
3. **ViewModel** fetches data asynchronously using `viewModelScope.launch`  
4. UI observes `categorieState` (loading, success, error) and updates accordingly  
5. **LazyVerticalGrid** displays all categories with images + names  

---

## 📸 Screenshots
![WhatsApp Image 2025-08-19 at 23 10 16_c4b603ae](https://github.com/user-attachments/assets/32dec066-09bd-4e09-8dd6-050f6cff45fc)
![WhatsApp Image 2025-08-19 at 23 10 16_ba9af7f6](https://github.com/user-attachments/assets/2b2ae177-5d8a-45a3-94b4-d7c0ae27c84b)



---

## 🔧 Installation & Setup
1. Clone the repo  
   ```bash
   git clone https://github.com/your-username/RecipeApp.git

2. Open in Android Studio

3. Add Internet Permission in AndroidManifest.xml

`<uses-permission android:name="android.permission.INTERNET"/>`

4. Run the app 🚀

## 📌 Future Enhancements

🔹 Add detailed recipe screen

🔹 Implement search functionality

🔹 Add favorite recipes (Room Database)

## 👨‍💻 Author
Developed by Rameshwar Digambar Patil ✨
