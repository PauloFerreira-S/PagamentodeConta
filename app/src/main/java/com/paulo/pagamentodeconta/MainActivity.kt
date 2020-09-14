package com.paulo.pagamentodeconta

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.SeekBar
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
            Seekbar()
        btn_calcular.setOnClickListener(){
          calcular()
        }
        btn_limpar.setOnClickListener (){
            limpar()
        }

    }
    private fun Seekbar(){
        seekBar.setOnSeekBarChangeListener(
            object : SeekBar.OnSeekBarChangeListener{
                override fun onProgressChanged(
                    seekBar: SeekBar?,
                    progress: Int,
                    fromUser: Boolean
                ) {
                    txt_porcento.text = progress.toString()

                }

                override fun onStartTrackingTouch(seekBar: SeekBar?) {

                }

                override fun onStopTrackingTouch(seekBar: SeekBar?) {

                }
            }

        )



    }
    private fun calcular(){
        var Num1 = Num1.text.toString().toInt()
        var Num2 = Num2.text.toString().toInt()
        var Num3 = txt_porcento.text.toString().toInt()
        Num1 = Num1 + Num3
        var troco = (Num2 - Num1)

        txt_taxa.text = "R$"+ Num3
        txt_total.text = "R$"+ Num1
        txt_troco.text = "R$"+ troco
    }
    private fun limpar(){
        Num1.text = null
        Num2.text = null
        txt_total.text = ""
        txt_troco.text = ""
    }
}