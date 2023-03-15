package de.codeelements.splashdemo

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import de.codeelements.splashdemo.databinding.Activity2Binding


class Activity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState);

        this.title="Activity 2"

        Activity2Binding.inflate(layoutInflater).let {
            setContentView(it.root)

            it.button.setOnClickListener {
                val myIntent = Intent(this, ActivityMain::class.java)
                myIntent.putExtra("key", "param1") //Optional parameters
                startActivity(myIntent)
            }

        }

    }

}