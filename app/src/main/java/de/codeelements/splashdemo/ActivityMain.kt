package de.codeelements.splashdemo

import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.ContentFrameLayout
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import de.codeelements.splashdemo.databinding.ActivityMainBinding


class ActivityMain : AppCompatActivity() {

    var keep=true

    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    override fun onCreate(savedInstanceState: Bundle?) {

//        if(savedInstanceState==null) {
//            keep = false

            val splashScreen = installSplashScreen()

//            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
////                setTheme(R.style.App_Theme_Main);
//                val splashScreen = installSplashScreen()
//
//                splashScreen.setKeepOnScreenCondition {
//                    keep
//                }
//
//                Handler(Looper.getMainLooper()).postDelayed({
//                    keep = false
//                }, 3000L)
//
//            } else {
//                setTheme(R.style.App_Theme_Main);
//            }
//
//        }
//        else
//            setTheme(R.style.App_Theme_Main);
//        }

        super.onCreate(savedInstanceState);

        this.title="Activity 1"

      ActivityMainBinding.inflate(layoutInflater).let {

          it.button.setOnClickListener {
              val myIntent = Intent(this, Activity2::class.java)
              myIntent.putExtra("key", "param1") //Optional parameters
              startActivity(myIntent)
          }

          setContentView(it.root)
      }

//        if(savedInstanceState==null)
//          setupPreDrawListener()
    }

    /**
     * Use this method only if you want to keep splash screen for longer than cold start time.
     * Manage `isReady` flag according to your logic.
     */
    private fun setupPreDrawListener() {
        // Set up an OnPreDrawListener to the root view.
//        val content: View = findViewById(android.R.id.content)
        val content: ContentFrameLayout = findViewById(android.R.id.content)
//
//
//
//
//        val params: ActionBarOverlayLayout.LayoutParams = ActionBarOverlayLayout.LayoutParams(
//            ActionBarOverlayLayout.LayoutParams.WRAP_CONTENT,
//            ActionBarOverlayLayout.LayoutParams.WRAP_CONTENT
//        )

//        params.width=240
//        params.height=240
//        params.topMargin=2600
//        content.layoutParams = params

        //create a layout
//        val layout = LinearLayout(this)
//        layout.orientation = LinearLayout.VERTICAL
//
//        //create a button
//        val btnAddARoom = Button(this)
//        btnAddARoom.text = "Add"
//        btnAddARoom.layoutParams = params
//
//        layout.addView(btnAddARoom)
//
//        //create the layout param for the layout
//        val layoutParam: LinearLayout.LayoutParams = LinearLayout.LayoutParams(
//            LinearLayout.LayoutParams.MATCH_PARENT,
//            LinearLayout.LayoutParams.WRAP_CONTENT
//        )

//        addContentView(layout, layoutParam)

        // TEXTVIEW
        // TEXTVIEW
//        if (layout.getParent() != null) {
//            (layout.getParent() as ViewGroup).removeView(layout) // <- fix
//        }
//        content.addView(layout)
//

//        content.rootView.setBackgroundColor(0)

//        content.viewTreeObserver.addOnPreDrawListener(
//            object : ViewTreeObserver.OnPreDrawListener {
//                override fun onPreDraw(): Boolean {
//                    // Check if the initial data is ready.
//                    val isReady = false
//                    return if (isReady) {
//                        // The content is ready; start drawing.
//                        content.viewTreeObserver.removeOnPreDrawListener(this)
//                        true
//                    } else {
//                        // The content is not ready; suspend.
////                        content.parent.bringChildToFront(layout)
//
//                        false
//                    }
//                }
//            }
//        )
    }
}