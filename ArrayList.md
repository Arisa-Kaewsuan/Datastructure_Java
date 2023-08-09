# ARRAYLIST
  - &nbsp; ArrayList คืออะไร ?

        ArrayList คือ Array ที่ขยายขนาดได้เอง  
    
    <br/>
    
  - &nbsp; Exerxise 1 &nbsp;:&nbsp; [ArrayList 🔗](https://github.com/Arisa-Kaewsuan/Datastructure_Java/tree/main/ArrayList/src)

        Exercise 1.1 : จงเขียนโปรแกรมสร้าง ArrayList ด้วยภาษา Java  ให้มี function ต่างๆดังนี้  แล้วหา Big-O ของแต่ละ function
          -  add() : เพิ่มข้อมูลลง ArrayList
          -  get() : ดึงข้อมูลจาก ArrayList
          -  set() : แก้ไขข้อมูลใน ArrayList
          -  toString() : : ปริ้น ArrayList ในform [a,b,c]

    <br/>

        Exercise 1.2 : จงเขียนโปรแกรมสร้าง ArrayList แบบ Generic

    <br/>

     > **ArrayList  Conclusion**
     >- เพิ่ม หรือลบข้อมูล (insert/add/remove/delete)  &nbsp;&nbsp;:&nbsp;&nbsp;  O(n) เพราะ ถ้าลบ/เพิ่มจากหัวต้องมีการกระเถิบ n ครั้ง  ถ้าเพิ่มหรือลบตรงตูดจะ O(1) เป็น best case เพราะทำได้เลย  แต่วิเคราะห์ประสิทธิภาพเราจะดูแค่ worst case (Big-O)
     
     >- การดึง หรือเข้าถึงข้อมูล (Acess/get) : O(1)
     
     >- set ข้อมูล : O(1)
     
     > จะเห็นว่า ArrayList เร็วมาก แต่มีข้อเสียตรงที่ ต้องจองพื้นที่ไว้เหลือๆ ซึ่งเป็นการเปลือง space จึงมีคนคิด Linked List ขึ้นมา
    
    <br/>
    
  - &nbsp; Exerxise 2 &nbsp;:&nbsp; [Particle](https://github.com/Arisa-Kaewsuan/Datastructure_Java/tree/main/Particle/src) -----  [[ ตัวอย่าง Particle อื่นๆ ]](https://particles.js.org/samples/index.html#connect) 🔗

        Exercise 2 : จงเขียนโปรแกรมสร้าง Particle โดยเอา ArrayList จากข้อที่แล้วมาประยุกต์ใช้  
    
    <br/><br/>

[<  &nbsp;Contents](https://github.com/Arisa-Kaewsuan/Datastructure_Java/blob/main/README.md)  &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; [Linked List&nbsp;  >](https://github.com/Arisa-Kaewsuan/Datastructure_Java/blob/main/LinkedList.md)
    
