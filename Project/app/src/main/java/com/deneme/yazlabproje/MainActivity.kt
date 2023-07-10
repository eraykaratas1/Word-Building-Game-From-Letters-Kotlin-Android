package com.deneme.yazlabproje


import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import java.nio.charset.Charset

class MainActivity : AppCompatActivity() {

    var txt : String=""

    var total_point : Int=0

    var false_count : Int=0

    var count : Int=0

    var buttons = ArrayList<Button>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var input_stream = baseContext .resources.openRawResource(R.raw.kelimeler)
        var words = input_stream.readBytes().toString(Charset.defaultCharset())

        var words_list = words.lines()

        var character_list=arrayListOf<Char>()

        var point_list=arrayListOf<Int>()

        var buttons_control=arrayListOf<Int>()

        for(x in 0..36){

            buttons_control.add(0)

        }

        character_list.add('A')
        character_list.add('B')
        character_list.add('C')
        character_list.add('Ç')
        character_list.add('D')
        character_list.add('E')
        character_list.add('F')
        character_list.add('G')
        character_list.add('Ğ')
        character_list.add('H')
        character_list.add('I')
        character_list.add('İ')
        character_list.add('J')
        character_list.add('K')
        character_list.add('L')
        character_list.add('M')
        character_list.add('N')
        character_list.add('O')
        character_list.add('Ö')
        character_list.add('P')
        character_list.add('R')
        character_list.add('S')
        character_list.add('Ş')
        character_list.add('T')
        character_list.add('U')
        character_list.add('Ü')
        character_list.add('V')
        character_list.add('Y')
        character_list.add('Z')

        character_list.add('A')
        character_list.add('B')
        character_list.add('C')
        character_list.add('Ç')
        character_list.add('D')
        character_list.add('E')
        character_list.add('F')
        character_list.add('G')

        point_list.add(1)
        point_list.add(3)
        point_list.add(4)
        point_list.add(4)
        point_list.add(3)
        point_list.add(1)
        point_list.add(7)
        point_list.add(5)
        point_list.add(8)
        point_list.add(5)
        point_list.add(2)
        point_list.add(1)
        point_list.add(10)
        point_list.add(1)
        point_list.add(1)
        point_list.add(2)
        point_list.add(1)
        point_list.add(2)
        point_list.add(7)
        point_list.add(5)
        point_list.add(1)
        point_list.add(2)
        point_list.add(4)
        point_list.add(1)
        point_list.add(2)
        point_list.add(3)
        point_list.add(7)
        point_list.add(3)
        point_list.add(4)

        point_list.add(1)
        point_list.add(3)
        point_list.add(4)
        point_list.add(4)
        point_list.add(3)
        point_list.add(1)
        point_list.add(7)
        point_list.add(5)



        buttons.add(button1)
        buttons.add(button2)
        buttons.add(button3)
        buttons.add(button4)
        buttons.add(button5)
        buttons.add(button6)
        buttons.add(button7)
        buttons.add(button8)
        buttons.add(button9)
        buttons.add(button10)
        buttons.add(button11)
        buttons.add(button12)
        buttons.add(button13)
        buttons.add(button14)
        buttons.add(button15)
        buttons.add(button16)
        buttons.add(button17)
        buttons.add(button18)
        buttons.add(button19)
        buttons.add(button20)
        buttons.add(button21)
        buttons.add(button22)
        buttons.add(button23)
        buttons.add(button24)
        buttons.add(button25)
        buttons.add(button26)
        buttons.add(button27)
        buttons.add(button28)
        buttons.add(button29)

        buttons.add(button30)
        buttons.add(button31)
        buttons.add(button32)
        buttons.add(button33)
        buttons.add(button34)
        buttons.add(button35)
        buttons.add(button36)
        buttons.add(button37)


        for(num in buttons.indices){

            var location_Y = buttons.get(num).y

            if(num <=7){

                var offsetY = 1000f
                buttons.get(num).animate()
                    .y(location_Y + offsetY)
                    .setDuration(1000)
                    .start()

            }
            if(num >7 && num<=15){

                var offsetY = 900f
                buttons.get(num).animate()
                    .y(location_Y + offsetY)
                    .setDuration(1000)
                    .start()

            }
            if(num >15 && num<=23){

                var offsetY = 800f
                buttons.get(num).animate()
                    .y(location_Y + offsetY)
                    .setDuration(1000)
                    .start()

            }


        }

        fun Count_Click(y : String){

            var temp : String=""

            var temp_count : Int=0

            var characters = txt.toCharArray()

            for(c in characters){


                if( y != c.toString()){

                    temp += c

                }
                else{

                    temp_count +=1

                    if(temp_count>1){

                        break;
                    }


                }


            }

              txt = temp

              OutputWord.text = txt


        }
        fun Add(x : String){

            txt += x

            OutputWord.text = txt

        }
        button1.setOnClickListener {


            buttons_control.set(0,buttons_control.get(0)+1)

            if(buttons_control.get(0) == 2){

                Count_Click(button1.text.toString())
                buttons_control.set(0,0)

            }
            else{
                buttons_control.set(0,1)
                Add(button1.text.toString())

            }



        }

        button2.setOnClickListener {

            buttons_control.set(1,buttons_control.get(1)+1)

            if(buttons_control.get(1) == 2){

                Count_Click(button2.text.toString())
                buttons_control.set(1,0)

            }
            else{
                buttons_control.set(1,1)
                Add(button2.text.toString())

            }


        }

        button3.setOnClickListener {

            buttons_control.set(2,buttons_control.get(2)+1)

            if(buttons_control.get(2) == 2){

                Count_Click(button3.text.toString())
                buttons_control.set(2,0)

            }
            else{
                buttons_control.set(2,1)
                Add(button3.text.toString())

            }


        }

        button4.setOnClickListener {

            buttons_control.set(3,buttons_control.get(3)+1)

            if(buttons_control.get(3) == 2){

                Count_Click(button4.text.toString())
                buttons_control.set(3,0)

            }
            else{
                buttons_control.set(3,1)
                Add(button4.text.toString())

            }


        }

        button5.setOnClickListener {

            buttons_control.set(4,buttons_control.get(4)+1)

            if(buttons_control.get(4) == 2){

                Count_Click(button5.text.toString())
                buttons_control.set(4,0)

            }
            else{
                buttons_control.set(4,1)
                Add(button5.text.toString())

            }


        }

        button6.setOnClickListener {

            buttons_control.set(5,buttons_control.get(5)+1)

            if(buttons_control.get(5) == 2){

                Count_Click(button6.text.toString())
                buttons_control.set(5,0)

            }
            else{
                buttons_control.set(5,1)
                Add(button6.text.toString())

            }


        }

        button7.setOnClickListener {

            buttons_control.set(6,buttons_control.get(6)+1)

            if(buttons_control.get(6) == 2){

                Count_Click(button7.text.toString())
                buttons_control.set(6,0)

            }
            else{
                buttons_control.set(6,1)
                Add(button7.text.toString())

            }


        }

        button8.setOnClickListener {

            buttons_control.set(7,buttons_control.get(7)+1)

            if(buttons_control.get(7) == 2){

                Count_Click(button8.text.toString())
                buttons_control.set(7,0)

            }
            else{
                buttons_control.set(7,1)
                Add(button8.text.toString())

            }


        }
        button9.setOnClickListener {

            buttons_control.set(8,buttons_control.get(8)+1)

            if(buttons_control.get(8) == 2){

                Count_Click(button9.text.toString())
                buttons_control.set(8,0)

            }
            else{
                buttons_control.set(8,1)
                Add(button9.text.toString())

            }


        }
        button10.setOnClickListener {

            buttons_control.set(9,buttons_control.get(9)+1)

            if(buttons_control.get(9) == 2){

                Count_Click(button10.text.toString())
                buttons_control.set(9,0)

            }
            else{
                buttons_control.set(9,1)
                Add(button10.text.toString())

            }


        }
        button11.setOnClickListener {

            buttons_control.set(10,buttons_control.get(10)+1)

            if(buttons_control.get(10) == 2){

                Count_Click(button11.text.toString())
                buttons_control.set(10,0)

            }
            else{
                buttons_control.set(10,1)
                Add(button11.text.toString())

            }


        }

        button12.setOnClickListener {

            buttons_control.set(11,buttons_control.get(11)+1)

            if(buttons_control.get(11) == 2){

                Count_Click(button12.text.toString())
                buttons_control.set(11,0)

            }
            else{
                buttons_control.set(11,1)
                Add(button12.text.toString())

            }


        }

        button13.setOnClickListener {

            buttons_control.set(12,buttons_control.get(12)+1)

            if(buttons_control.get(12) == 2){

                Count_Click(button13.text.toString())
                buttons_control.set(12,0)

            }
            else{
                buttons_control.set(12,1)
                Add(button13.text.toString())

            }


        }

        button14.setOnClickListener {

            buttons_control.set(13,buttons_control.get(13)+1)

            if(buttons_control.get(13) == 2){

                Count_Click(button14.text.toString())
                buttons_control.set(13,0)

            }
            else{
                buttons_control.set(13,1)
                Add(button14.text.toString())

            }


        }

        button15.setOnClickListener {

            buttons_control.set(14,buttons_control.get(14)+1)

            if(buttons_control.get(14) == 2){

                Count_Click(button15.text.toString())
                buttons_control.set(14,0)

            }
            else{
                buttons_control.set(14,1)
                Add(button15.text.toString())

            }


        }

        button16.setOnClickListener {

            buttons_control.set(15,buttons_control.get(15)+1)

            if(buttons_control.get(15) == 2){

                Count_Click(button16.text.toString())
                buttons_control.set(15,0)

            }
            else{
                buttons_control.set(15,1)
                Add(button16.text.toString())

            }


        }

        button17.setOnClickListener {

            buttons_control.set(16,buttons_control.get(16)+1)

            if(buttons_control.get(16) == 2){

                Count_Click(button17.text.toString())
                buttons_control.set(16,0)

            }
            else{
                buttons_control.set(16,1)
                Add(button17.text.toString())

            }


        }

        button18.setOnClickListener {

            buttons_control.set(17,buttons_control.get(17)+1)

            if(buttons_control.get(17) == 2){

                Count_Click(button18.text.toString())
                buttons_control.set(17,0)

            }
            else{
                buttons_control.set(17,1)
                Add(button18.text.toString())

            }



        }
        button19.setOnClickListener {

            buttons_control.set(18,buttons_control.get(18)+1)

            if(buttons_control.get(18) == 2){

                Count_Click(button19.text.toString())
                buttons_control.set(18,0)

            }
            else{
                buttons_control.set(18,1)
                Add(button19.text.toString())

            }



        }
        button20.setOnClickListener {

            buttons_control.set(19,buttons_control.get(19)+1)

            if(buttons_control.get(19) == 2){

                Count_Click(button20.text.toString())
                buttons_control.set(19,0)

            }
            else{
                buttons_control.set(19,1)
                Add(button20.text.toString())

            }



        }
        button21.setOnClickListener {

            buttons_control.set(20,buttons_control.get(20)+1)

            if(buttons_control.get(20) == 2){

                Count_Click(button21.text.toString())
                buttons_control.set(20,0)

            }
            else{
                buttons_control.set(20,1)
                Add(button21.text.toString())

            }


        }

        button22.setOnClickListener {

            buttons_control.set(21,buttons_control.get(21)+1)

            if(buttons_control.get(21) == 2){

                Count_Click(button22.text.toString())
                buttons_control.set(21,0)

            }
            else{
                buttons_control.set(21,1)
                Add(button22.text.toString())

            }


        }

        button23.setOnClickListener {

            buttons_control.set(22,buttons_control.get(22)+1)

            if(buttons_control.get(22) == 2){

                Count_Click(button23.text.toString())
                buttons_control.set(22,0)

            }
            else{
                buttons_control.set(22,1)
                Add(button23.text.toString())

            }


        }

        button24.setOnClickListener {

            buttons_control.set(23,buttons_control.get(23)+1)

            if(buttons_control.get(23) == 2){

                Count_Click(button24.text.toString())
                buttons_control.set(23,0)

            }
            else{
                buttons_control.set(23,1)
                Add(button24.text.toString())

            }


        }

        button25.setOnClickListener {

            buttons_control.set(24,buttons_control.get(24)+1)

            if(buttons_control.get(24) == 2){

                Count_Click(button25.text.toString())
                buttons_control.set(24,0)

            }
            else{
                buttons_control.set(24,1)
                Add(button25.text.toString())

            }


        }

        button26.setOnClickListener {

            buttons_control.set(25,buttons_control.get(25)+1)

            if(buttons_control.get(25) == 2){

                Count_Click(button26.text.toString())
                buttons_control.set(25,0)

            }
            else{
                buttons_control.set(25,1)
                Add(button26.text.toString())

            }


        }

        button27.setOnClickListener {

            buttons_control.set(26,buttons_control.get(26)+1)

            if(buttons_control.get(26) == 2){

                Count_Click(button27.text.toString())
                buttons_control.set(26,0)

            }
            else{
                buttons_control.set(26,1)
                Add(button27.text.toString())

            }


        }

        button28.setOnClickListener {

            buttons_control.set(27,buttons_control.get(27)+1)

            if(buttons_control.get(27) == 2){

                Count_Click(button28.text.toString())
                buttons_control.set(27,0)

            }
            else{
                buttons_control.set(27,1)
                Add(button28.text.toString())

            }


        }
        button29.setOnClickListener {

            buttons_control.set(28,buttons_control.get(28)+1)

            if(buttons_control.get(28) == 2){

                Count_Click(button29.text.toString())
                buttons_control.set(28,0)

            }
            else{
                buttons_control.set(28,1)
                Add(button29.text.toString())

            }


        }
        button30.setOnClickListener {

            buttons_control.set(29,buttons_control.get(29)+1)

            if(buttons_control.get(29) == 2){

                Count_Click(button30.text.toString())
                buttons_control.set(29,0)

            }
            else{
                buttons_control.set(29,1)
                Add(button30.text.toString())

            }


        }
        button31.setOnClickListener {

            buttons_control.set(30,buttons_control.get(30)+1)

            if(buttons_control.get(30) == 2){

                Count_Click(button31.text.toString())
                buttons_control.set(30,0)

            }
            else{
                buttons_control.set(30,1)
                Add(button31.text.toString())

            }


        }
        button32.setOnClickListener {

            buttons_control.set(31,buttons_control.get(31)+1)

            if(buttons_control.get(31) == 2){

                Count_Click(button32.text.toString())
                buttons_control.set(31,0)

            }
            else{
                buttons_control.set(31,1)
                Add(button32.text.toString())

            }


        }
        button33.setOnClickListener {

            buttons_control.set(32,buttons_control.get(32)+1)

            if(buttons_control.get(32) == 2){

                Count_Click(button33.text.toString())
                buttons_control.set(32,0)

            }
            else{
                buttons_control.set(32,1)
                Add(button33.text.toString())

            }


        }
        button34.setOnClickListener {

            buttons_control.set(33,buttons_control.get(33)+1)

            if(buttons_control.get(33) == 2){

                Count_Click(button34.text.toString())
                buttons_control.set(33,0)

            }
            else{
                buttons_control.set(33,1)
                Add(button34.text.toString())

            }


        }
        button35.setOnClickListener {

            buttons_control.set(34,buttons_control.get(34)+1)

            if(buttons_control.get(34) == 2){

                Count_Click(button35.text.toString())
                buttons_control.set(34,0)

            }
            else{
                buttons_control.set(34,1)
                Add(button35.text.toString())

            }


        }
        button36.setOnClickListener {

            buttons_control.set(35,buttons_control.get(35)+1)

            if(buttons_control.get(35) == 2){

                Count_Click(button36.text.toString())
                buttons_control.set(35,0)

            }
            else{
                buttons_control.set(35,1)
                Add(button36.text.toString())

            }


        }
        button37.setOnClickListener {

            buttons_control.set(36,buttons_control.get(36)+1)

            if(buttons_control.get(36) == 2){

                Count_Click(button37.text.toString())
                buttons_control.set(36,0)

            }
            else{
                buttons_control.set(36,1)
                Add(button37.text.toString())

            }


        }


        buttonDelete.setOnClickListener {

            for(x in 0..36){

                buttons_control.set(x,0)

            }

            OutputWord.text =""
            txt=""


        }

        buttonSearch.setOnClickListener {

            if(OutputWord.text.toString().length<3){ // girilen kelimenin uzunluğu 3'den küçükse

                Toast.makeText(this,"Eşleştirme için lütfen en az 3 karakter giriniz",Toast.LENGTH_SHORT).show()

                false_count +=1



            }
            else{ // 3 ve 3'den büyük

                var str =OutputWord.text.toString()

                var value : Int=0

                for(temp in words_list){



                    if(str.equals(temp, ignoreCase = true)){



                        value++
                        Toast.makeText(this,"Kelime Bulundu",Toast.LENGTH_LONG).show()

                        var chars = str.toCharArray()

                        for(c in chars){

                            var count : Int=0


                            for(num in character_list.indices){

                                if(character_list.get(num)==c){


                                    total_point += point_list.get(num) // puan arttırıldı

                                }


                            }


                        }

                        for(x in 29..36){

                            if(buttons_control.get(x) ==1){


                              total_point -= point_list.get(x)

                            }
                            if(buttons_control.get(x-29) ==1){


                                total_point -= point_list.get(x)
                            }



                        }



                        GamePoint.text ="Puan:" + total_point.toString() // Puan yazdırıldı



                        for(num in buttons_control.indices){

                            if(buttons_control.get(num)==1){

                                buttons.get((num)).visibility=View.INVISIBLE

                            }


                        }


                    }
                }

                if(value == 0){ // Eşleştirme bulunamadıysa

                    Toast.makeText(this,"Kelime Bulunamadı",Toast.LENGTH_SHORT).show()

                    false_count +=1

                }

            }

            if(false_count == 3){

                Toast.makeText(this,"Hatalı Kelime Sayısı:3",Toast.LENGTH_LONG).show()

                false_count = 0

            }



        }









    }


}