package com.example.allanimations_12_12_22

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.allanimations_12_12_22.databinding.ActivityMainBinding
import render.animations.Attention
import render.animations.Bounce
import render.animations.Fade
import render.animations.Flip
import render.animations.Render
import render.animations.Rotate

class MainActivity : AppCompatActivity() {
    lateinit var binding :ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val render = Render(this)
        binding.InDown.setOnClickListener(){
            render.setAnimation(Bounce.InDown(binding.perform))
            render.start()
        }
        binding.InUp.setOnClickListener(){
            render.setAnimation(Bounce.InUp(binding.perform))
            render.start()
        }
        binding.InLeft.setOnClickListener(){
            render.setAnimation(Bounce.InLeft(binding.perform))
            render.start()
        }
        binding.InRight.setOnClickListener(){
            render.setAnimation(Bounce.InRight(binding.perform))
            render.start()
        }
        binding.In.setOnClickListener(){
            render.setAnimation(Bounce.In(binding.perform))
            render.start()
        }
        //Attention
        binding.bounce.setOnClickListener(){
            render.setAnimation(Attention.Bounce(binding.perform))
            render.start()
        }
        binding.Flash.setOnClickListener(){
            render.setAnimation(Attention.Flash(binding.perform))
            render.start()
        }
        binding.Pulse.setOnClickListener(){
            render.setAnimation(Attention.Pulse(binding.perform))
            render.start()
        }
        binding.Ruberband.setOnClickListener(){
            render.setAnimation(Attention.RuberBand(binding.perform))
            render.start()
        }
        binding.Shake.setOnClickListener(){
            render.setAnimation(Attention.Shake(binding.perform))
            render.start()
        }
        binding.Standup.setOnClickListener(){
            render.setAnimation(Attention.StandUp(binding.perform))
            render.start()
        }
        binding.Swing.setOnClickListener(){
            render.setAnimation(Attention.Swing(binding.perform))
            render.start()
        }
        binding.Tada.setOnClickListener(){
            render.setAnimation(Attention.Tada(binding.perform))
            render.start()
        }
        binding.Wave.setOnClickListener(){
            render.setAnimation(Attention.Wave(binding.perform))
            render.start()
        }
        binding.Wobble.setOnClickListener(){
            render.setAnimation(Attention.Wobble(binding.perform))
            render.start()
        }
        //Fade
        binding.InDownF.setOnClickListener(){
            render.setAnimation(Fade.InDown(binding.perform))
            render.start()
        }
        binding.InUpF.setOnClickListener(){
            render.setAnimation(Fade.InUp(binding.perform))
            render.start()
        }
        binding.InLeftF.setOnClickListener(){
            render.setAnimation(Fade.InLeft(binding.perform))
            render.start()
        }
        binding.InRightF.setOnClickListener(){
            render.setAnimation(Fade.InRight(binding.perform))
            render.start()
        }
        binding.OutDownF.setOnClickListener(){
            render.setAnimation(Fade.OutDown(binding.perform))
            render.start()
        }
        binding.OutUpF.setOnClickListener(){
            render.setAnimation(Fade.OutUp(binding.perform))
            render.start()
        }
        binding.OutLeftF.setOnClickListener(){
            render.setAnimation(Fade.OutLeft(binding.perform))
            render.start()
        }
        binding.OutRightF.setOnClickListener(){
            render.setAnimation(Fade.OutRight(binding.perform))
            render.start()
        }
        binding.InF.setOnClickListener(){
            render.setAnimation(Fade.In(binding.perform))
            render.start()
        }
        binding.outF.setOnClickListener(){
            render.setAnimation(Fade.Out(binding.perform))
            render.start()
        }
        //Flip
        binding.InX.setOnClickListener(){
            render.setAnimation(Flip.InX(binding.perform))
            render.start()
        }
        binding.InY.setOnClickListener(){
            render.setAnimation(Flip.InY(binding.perform))
            render.start()
        }
        binding.OutX.setOnClickListener(){
            render.setAnimation(Flip.OutX(binding.perform))
            render.start()
        }
        binding.OutY.setOnClickListener(){
            render.setAnimation(Flip.OutY(binding.perform))
            render.start()
        }
        //Rotate
        binding.InDownLeft.setOnClickListener(){
            render.setAnimation(Rotate.InDownLeft(binding.perform))
            render.start()
        }
        binding.InDownRight.setOnClickListener(){
            render.setAnimation(Rotate.InDownRight(binding.perform))
            render.start()
        }
        binding.InUpLeft.setOnClickListener(){
            render.setAnimation(Rotate.InUpLeft(binding.perform))
            render.start()
        }
        binding.InUpRight.setOnClickListener(){
            render.setAnimation(Rotate.InUpRight(binding.perform))
            render.start()
        }
        binding.OutDownLeft.setOnClickListener(){
            render.setAnimation(Rotate.OutDownLeft(binding.perform))
            render.start()
        }
        binding.OutDownRight.setOnClickListener(){
            render.setAnimation(Rotate.OutDownRight(binding.perform))
            render.start()
        }
        binding.OutUpLeft.setOnClickListener(){
            render.setAnimation(Rotate.OutUpLeft(binding.perform))
            render.start()
        }
        binding.OutUpRight.setOnClickListener(){
            render.setAnimation(Rotate.OutUpRight(binding.perform))
            render.start()
        }
        binding.OutRo.setOnClickListener(){
            render.setAnimation(Rotate.Out(binding.perform))
            render.start()
        }
        binding.InRo.setOnClickListener(){
            render.setAnimation(Rotate.In(binding.perform))
            render.start()
        }



    }
}