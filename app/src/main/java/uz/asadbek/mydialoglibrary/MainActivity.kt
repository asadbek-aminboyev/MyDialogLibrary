package uz.asadbek.mydialoglibrary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import uz.asadbek.my_dialog.BeautifulDialog
import uz.asadbek.my_dialog.description
import uz.asadbek.my_dialog.hideNegativeButton
import uz.asadbek.my_dialog.onNegative
import uz.asadbek.my_dialog.onPositive
import uz.asadbek.my_dialog.position
import uz.asadbek.my_dialog.title
import uz.asadbek.my_dialog.type
import uz.asadbek.mydialoglibrary.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {


    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.btnSuccess.setOnClickListener {
            BeautifulDialog.build(this)
                .title("Success", titleColor = R.color.black)
                .description("Successfully", color = R.color.black)
                .position(BeautifulDialog.POSITIONS.CENTER)
                .type(BeautifulDialog.TYPE.SUCCESS)
                .onPositive("Confirm", shouldIDismissOnClick = false) {
                    Toast.makeText(this, "confirm", Toast.LENGTH_SHORT).show()
                }
                .onNegative("Cancel") {
                    Toast.makeText(this, "cancel", Toast.LENGTH_SHORT).show()
                }
                .hideNegativeButton(hide = false)
        }

        binding.btnError.setOnClickListener {
            BeautifulDialog.build(this)
                .title("Error", titleColor = R.color.black)
                .description("Error", color = R.color.black)
                .position(BeautifulDialog.POSITIONS.CENTER)
                .type(BeautifulDialog.TYPE.ERROR)
                .onPositive("Confirm", shouldIDismissOnClick = false) {
                    Toast.makeText(this, "confirm", Toast.LENGTH_SHORT).show()
                }
                .onNegative("Cancel") {
                    Toast.makeText(this, "cancel", Toast.LENGTH_SHORT).show()
                }
                .hideNegativeButton(hide = false)
        }

        binding.btnNone.setOnClickListener {
            BeautifulDialog.build(this)
                .title("Alert", titleColor = R.color.black)
                .description("Alert", color = R.color.black)
                .position(BeautifulDialog.POSITIONS.CENTER)
                .type(BeautifulDialog.TYPE.NONE)
                .onPositive("Confirm", shouldIDismissOnClick = false) {
                    Toast.makeText(this, "confirm", Toast.LENGTH_SHORT).show()
                }
                .onNegative("Cancel") {
                    Toast.makeText(this, "cancel", Toast.LENGTH_SHORT).show()
                }
                .hideNegativeButton(hide = false)
        }

    }
}