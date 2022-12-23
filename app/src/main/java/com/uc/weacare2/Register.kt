package com.uc.weacare2//package com.uc.weacare2
//
//import android.content.Intent
//import androidx.appcompat.app.AppCompatActivity
//import android.os.Bundle
//import android.util.Patterns
//import kotlinx.android.synthetic.main.activity_register.*
//
//class Register : AppCompatActivity() {
////    private lateinit var user: User
//    private var position = -1
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_register)
//
//        listener()
//    }
//    private fun listener(){
//        signup_btn.setOnClickListener {
//            var username = username_textinput.editText?.text.toString().trim()
//            var email = email_textinput.editText?.text.toString().trim()
//            var password = password_textinput.editText?.text.toString().trim()
//
////            user = User(nama,email,password)
//
//            checker()
//
//        }
//
//        signIn_txt.setOnClickListener{
//            val myIntent = Intent(this, Login::class.java).apply {
//
//            }
//            startActivity(myIntent)
//        }
//    }
//
//    private fun checker(){
//        var isCompleted:Boolean = true
//
//        //cek nama
////        if(user.nama!!.isEmpty()){
////            username_textinput.error = "Tolong isi kolom nama"
////            isCompleted = false
////        }else{
////            username_textinput.error = ""
////        }
//
//        //cek email
////        if(user.email!!.isEmpty()){
////            email_textinput.error = "Tolong isi kolom email"
////            isCompleted= false
////        }else{
////            //berguna untuk cek apakah input merupakan email
////            if (!Patterns.EMAIL_ADDRESS.matcher(user.email!!).matches()){
////                email_textinput.error = "Tolong masukkan alamat email yang benar!"
////                isCompleted = false
////            }else {
////                email_textinput.error = ""
////            }
////        }
//
//        //cek password
////        if(user.password!!.isEmpty()){
////            password_textinput.error = "Tolong isi kolom password"
////            isCompleted = false
////        }else{
////            if(user.password!!.length < 8){
////                password_textinput.error = "Jumlah password min 8 karakter"
////                isCompleted= false
////            }else if(!user.password!!.matches(".*[a-z].*".toRegex())) {
////                password_textinput.error = "Jassword tidak memiliki huruf kecil"
////                isCompleted = false
////            }else if(!user.password!!.matches(".*[A-Z].*".toRegex())){
////                password_textinput.error = "Password tidak memiliki huruf kapital"
////                isCompleted = false
////            }else{
////                password_textinput.error = ""
////            }
////        }
//        if(isCompleted) {
//            if (position == -1) {
////                GlobalVar.listDataUser.add(user)
//                val myIntent = Intent(this, Login::class.java).apply {
//                }
//                startActivity(myIntent)
//
//            }
//        }
//    }
//
//
//}
//
//
//
//
//
//
