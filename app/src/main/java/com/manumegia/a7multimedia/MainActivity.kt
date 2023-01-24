package com.manumegia.a7multimedia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.manumegia.a7multimedia.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.bElPGuerrero.setOnClickListener {
            binding.imgElClase.setImageResource(R.drawable.jesucristo_guerrero)
        }

        binding.bElPLadron.setOnClickListener {
            binding.imgElClase.setImageResource(R.drawable.jesucristoladron__2_)
        }

        binding.bElPMago.setOnClickListener {
            binding.imgElClase.setImageResource(R.drawable.jesucristo_mago)
        }

        binding.bElPBerserker.setOnClickListener {
            binding.imgElClase.setImageResource(R.drawable.jesucristo_berserkeraii)
        }

        binding.bElPInicio.setOnClickListener {
            val intent = Intent(this, PantallaBlanco::class.java)
            startActivity(intent)
        }
    }
}