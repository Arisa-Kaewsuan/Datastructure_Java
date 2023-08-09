 # RECURSIVE

 - &nbsp; Recursive คืออะไร เรียนไปทำไม ?

                Recursive / Recursion / Recursive function คือ ฟังก์ชันที่เรียกใช้ตัวเองเพื่อแก้ปัญหาด้วยการแบ่งปัญหาให้เล็กลง
       จากนั้นรวมผลลัพธ์เข้าด้วยกัน ซึ่งการแก้ปัญหา ในรูปแบบนี้เรียกว่า Divide-and-conquer  ไม่ใช่ทุกปัญหาที่จะสามารถใช้ Recursive
       ในการแก้ปัญหาได้ ถึงแม้บางปัญหาจะสามารถใช้ได้ แต่การเขียนโปรแกรมด้วยการใช้คำสั่งวน loop / Iteration ปกติอาจจะเหมาะสมและ
       มีประสิทธิภาพกว่าการใช้ Recursive
   

       :: วิธีการเขียน Recursive Function ::
          Recursive ประกอบไปด้วย 2 ส่วน คือ
   
       1.  Base  Case  คือ  เงื่อนไขที่ทำให้เราหลุดจาก loop
   
       2.  General  Case  คือ  คือการเรียกใช้ Function ตัวมันเอง ทำให้เกิดการวนลูปทำงานซ้ำ การทำงานของ Recursive คือ
           เมื่อ Function มีการเรียกตัวเอง มันจะเพิ่มไปยัง Recursive Call Stack โดย Stack ก็คือ LIFO (Last In First Out)
           ซึ่งหมายความว่า Item สุดท้ายที่ถูกเพิ่มมาที่ด้านบนของ Stack จะเป็น Item แรกที่จะถูก Remove ออกจาก Stack

           ดังนั้น ถ้าเราจะเขียน Recursive  function ต้องหา Base Case และ General Case ให้เจอ


       :: ยกตัวอย่าง โจทย์ปัญหาที่ใช้ recursion แก้ได้ ::
          จงหา Factorial ของ 5
   
          sol   การหา Factorial ทำได้โดย
                  1!  =  1  
                  2!  =  1*2  =  1!*2  =  2
                  3!  =  1*2*3  =  2!*3  =  6
                  4!  =  1*2*3*4  =  3!*4  =  24
                  5!  =  1*2*3*4*5  =  4!*5  =  120
   
               จะเห็นว่า เป็นการทำงานซ้ำๆ  และ สามารถแบ่งจากเคสใหญ่ที่ต้องการหา 5! เป็นการหาเคสย่อยที่สุด คือ 1! ได้ ในกรณีนี้
               สามารถใช้ได้ทั้ง loop และ recursive  ดังรูป

   ![recursive_factorial](https://github.com/Arisa-Kaewsuan/Datastructure_Java/assets/87797742/a44cae04-5197-4bcf-a454-53352382fffa)

               จะเห็นว่าปัญหาเดียว สามารถเขียน code แก้ปัญหาได้หลายแบบ หลายอัลกอริทึม
   <br/>
   
 - &nbsp; เราควรใช้ loop ตอนไหน และตอนไหนควรใช้ Recursive ?

               Recursion ถูกสร้างขึ้นเพื่อแก้ไขปัญหาที่สามารถจะแบ่งออกเป็นปัญหาที่เล็กลงได้ และเป็นปัญหาที่เกิดขึ้นซ้ำๆ ที่มีความซับซ้อนเกินกว่าที่จะใช้
         Iteration เช่น การเขียนโปรแกรม Search ผ่าน File System ที่มี โครงสร้าง(Data Structure) เป็น Tree จะเริ่มต้นหาที่ Root Folder จาก
         นั้นสามารถ Search ทุก File และ Folder ทั้งหมดที่อยู่ภายใน Folder นั้น หลังจากนั้น จะเข้าไปในแต่ละ Folder แล้ว Search ในแต่ละ Folder
         ที่อยู่ภายในนั้นอีก  จะเห็นว่าซับซ้อนมากถ้าเราใช้ loop ต้องมาตรวจสอบและเช็คเงื่อนไขต่าง ๆ ที่เป็นไปได้ทั้งหมด ซึ่งเยอะมาก  ดังนั้น
         recursion จึงเหมาะใช้ในการสำรวจ (Traversal) เส้นทางในโครงสร้างแบบ Tree หรือ Graph และ ปัญหาที่แก้ได้ด้วยวิธี Divine & Conquer
         มากกว่า  เพราะการใช้ปกติอย่างตัวอย่างก่อนหน้าที่เป็นการหา Factorial จะเห็นว่า การใช้ recursion จะเพิ่มการใช้งานของ Memory โดยไม่จำเป็น
         มีบางครั้ง ที่เราอาจต้องยอมให้เกิดสิ่งนี้เพื่อให้ได้ Algorithm ที่สั้นอ่านง่าย แต่บางทีก็อาจมีวิธีที่ดีกว่าและมีประสิทธิภาพมากกว่านี้ในการแก้ไขปัญหา

               เราต้องเรียน recursion เพราะมันจะถูกนำไปประยุกต์ใช้ในบทต่อๆไป  เช่น Merge Sort , Hanoi Tower

               สำหรับ Project ขนาดเล็กการ recursion จะไม่สร้างปัญหากับ Program มากนัก แต่ถ้า Program เริ่มมี input มากขึ้น เริ่มสร้าง
         Recursive Call ซ้ำหลาย ๆ ครั้ง อาจต้องพิจารณาถึงผลกระทบที่อาจเกิดขึ้นจาก Call Stack ที่มี ขนาดใหญ่ส่งผลให้โปรแกรมทำงานได้ช้าลงได้
   <br/>
   
 - &nbsp; Exerxise 1 &nbsp;:&nbsp; Fibonacci

               Fibonacci คือ สัดส่วนตัวเลขที่คิดค้นขึ้นจากฝั่งตะวันตกโดย Leonardo Bigollo Pisano (นักคณิตศาสตร์ชาวอิตาลี) เป็นผู้ค้นพบสัดส่วน
        นี้โดยเขาสังเกตว่าธรรมชาติรอบตัวเรา มีความพิเศษและมีความเป็นสัดส่วนที่เท่ากันอยู่ในธรรมชาติ เช่น อัตราส่วนของเปลือกหอย เกษรดอกไม้
        เขาค้นพบว่า Fibo คือสัดส่วนที่เกิดขึ้นตามธรรมชาติ และเป็นสัดส่วนที่สายตาของมนุษย์มองมาแล้วจะรู้สึกว่าลงตัว รู้สึกสวยงาม และสบายตา มีผลไปถึง
        สัดส่วนใบหน้าของชาย และหญิงที่คนเราจะมองแล้วรู้สึกว่าสวย หรือหล่อ เนื่องจากมีสัดส่วนธรรมชาติที่สมดุล และตรงกับลำดับ Fibonacci

               นิยามของ Fibo คือ สัดส่วนตัวเลข (อนุกรม) ที่ตัวเลขแต่ละตัวจะมาจากผลลัพธ์รวมกันของตัวเลข 2 อันดับก่อนหน้ามีชื่อเรียกว่า
        “Fibonacci Sequence” โดยเริ่มจากชุดตัวเลขตั้งแต่ 0 กับ 1 ตัวเลขถัดไปนั้น จะเกิดจาก 2 ตัวเลขก่อนหน้าบวกกัน และสามารถบวกกันต่อไปได้อย่าง
        ไม่มีจุดจบ

               ตัวอย่างเลข Fibonaicci 10 อันดับแรก : 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, …
   
       -----------------------------------------------------------------------------------------------------------------------
   
        Exercise 1 : จงเขียนโปรแกรมหาเลข Fibonacci 100 อันดับแรก โดยลองเขียนทั้งแบบ Iteration และ Recursive เพื่อฝึกฝนการเขียน recursion

        :: Test Case ::
         input : -- ข้อนี้ไม่มี input --
         output : 
   <br/>
   
 - &nbsp; Exerxise 2 &nbsp;:&nbsp; Factorial

         L
   <br/>
   
 - &nbsp; Exerxise 3 &nbsp;:&nbsp; Golden Ratio

         L
   <br/>
   
 - &nbsp; Exerxise 4 &nbsp;:&nbsp; Hanoi Tower
   
         L
   
   <br/><br/><br/>

[<  &nbsp;Contents](https://github.com/Arisa-Kaewsuan/Datastructure_Java/blob/main/README.md)  &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; [ArrayList&nbsp;  >](https://github.com/Arisa-Kaewsuan/Datastructure_Java/blob/main/Recursive.md)
