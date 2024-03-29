package id.dityara.testintent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity(), View.OnClickListener {


    private lateinit var btnMove :Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnMove = findViewById(R.id.btn_move_activity)
        btnMove.setOnClickListener(this)

        val btnMoveWithDataActivity: Button = findViewById(R.id.btn_move_activity_data)
        btnMoveWithDataActivity.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when(v.id){
            R.id.btn_move_activity ->{
                val moveIntent = Intent(this@MainActivity, DetailActivity::class.java)
                startActivity(moveIntent)
            }
            R.id.btn_move_activity_data->{
                val MoveWithDataIntent = Intent(this@MainActivity, MoveWithDataActivity::class.java)
                MoveWithDataIntent.putExtra(MoveWithDataActivity.EXTRA_NAME,"Aditya Rizki")
                MoveWithDataIntent.putExtra(MoveWithDataActivity.EXTRA_AGE,20)
                startActivity(MoveWithDataIntent)

            }
        }
    }
}
