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

               จะเห็นว่าปัญหาเดียว สามารถเขียน code แก้ปัญหาได้หลายแบบ หลายอัลกอริทึม
   <br/>
   
 - &nbsp; เราควรใช้ loop ตอนไหน และตอนไหนควรใช้ Recursive ?

         L
   <br/>
   
 - &nbsp; Exerxise 1 &nbsp;:&nbsp; Fibonacci

         L
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
