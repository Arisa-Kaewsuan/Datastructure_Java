# ARRAY 

- &nbsp; Array คืออะไร ?

          Array คือ โครงสร้างข้อมูลที่จัดเก็บข้อมูลไว้ในตำแหน่งหน่วยความจำที่อยู่ติดกัน  ต้องจองพื้นที่หน่วยความจำไว้ล่วงหน้า ข้อมูลที่จัดเก็บใน Array
      จะมีชนิดข้อมูลเหมือนกัน   สามารถเข้าถึงสมาชิกภายใน Array โดยการกำหนด Index

       :: ข้อดีของ Array ::
            -  อาร์เรย์อนุญาตให้เข้าถึงองค์ประกอบโดยสุ่ม ทำให้เข้าถึงองค์ประกอบตามตำแหน่งได้เร็วขึ้น

       :: ข้อเสียของ Array ::
            -  ขยายขนาดเองไม่ได้ เนื่องจากการจัดสรรหน่วยความจำแบบคงที่
            -  การแทรก และการลบ  ทำได้ยากเนื่องจาก ข้อมูลถูกจัดเก็บไว้ในตำแหน่งหน่วยความจำที่ต่อเนื่องกัน ต้องใช้การขยับ  ทำให้ช้า

       :: การประยุกต์ใช้ Array ::
            -  ใช้เพื่อปรับสร้างเป็นโครงสร้างข้อมูลอื่นๆ เช่น Stacks, Queues, Heaps, Hash tables
            -  การประยุกต์ใช้ Array สร้างเป็น Stack สามารถทำได้ แต่ไม่นิยม เพราะ Array ... นิยมใช้ Linked List มากกว่า
            -  ใช้ทำ โครงสร้าง record ใน Database
  <br/>

  
- &nbsp; Exercise 1 &nbsp;:&nbsp; [Maximum Subsequence Sum](https://github.com/Arisa-Kaewsuan/Datastructure_Java/tree/main/Maximum_Subsequencesum/src/myMSS)

          จงเขียนโปรแกรมหา Maximum  Subsequence  Sum
            -  โดยให้เขียน 3 แบบ : brute-force (mss1)  >>  พยายามลดloop เหลือ 2loop (mss2)  >>  พยายามลดloop เหลือ 1loop (mss3)
               แล้ววิเคราะห์หา BigO ของทั้ง 3 แบบ หาคำตอบว่า Algorithm ไหนมีประสิทธิภาพดีที่สุด เพราะอะไร ?

            -  เขียนฟังก์ชั่นจับเวลาของแต่ละ Algorithm ด้วย เพื่อใช้ดูเปรียบเทียบกับ Big-O ที่วิเคราะห์ได้
               Hint : ในภาษา java ใช้ currentTimemill() จับเวลาตอนเริ่ม และ ตอนทำเสร็จ เอามาลบกัน ได้เวลาที่ใช้ทั้งหมด

            -  Maximum Subsequence Sum คือ  ผลรวมของเลขที่อยู่ติดกัน ที่มีค่ามากที่สุด

          :: Test Case ::
          input  :  มี array [-2, 11, -6, 16, -5, 7]
          output  : Maximum Subsequence Sum คือ 23 มาจาก [11, -6, 16, -5, 7]
                    = 11 + (-6) + 16 + (-5) + 7
                    = 23

  
  > เฉลย Exercise 1  :  Algorithm mss3 มีประสิทธิภาพมากที่สุด  จะเห็นว่าการเขียนโปรแกรมแบบซ้อนลูป ยิ้งว้อนมาก ประสิทธิภาพยิ่งแย่ ควรเลี่ยง!
    >- mss1 : Big-O(n^3)
    >- mss2 : Big-O(n^2)
    >- mss3 : Big-O(n)
  <br/>
  
- &nbsp; Exercise 2 &nbsp;:&nbsp; Sorting Array
     >- Bubble Sort
     >- Selection Sort
     >- Insertion Sort
     >- Merge Sort
     >- Quick Sort

<br/><br/><br/>

[<  &nbsp;Contents](https://github.com/Arisa-Kaewsuan/Datastructure_Java/blob/main/README.md)  &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; [Recursive&nbsp;  >](https://github.com/Arisa-Kaewsuan/Datastructure_Java/blob/main/Array.md)
