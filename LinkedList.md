# LINKED LIST
  - &nbsp; [Linked List 🔗](https://expert-programming-tutor.com/tutorial/data_structure/03_%E0%B8%A5%E0%B8%B4%E0%B8%87%E0%B8%84%E0%B9%8C%E0%B8%A5%E0%B8%B4%E0%B8%AA%E0%B8%95%E0%B9%8C%20(Linked%20List).php) คืออะไร (idea concept) ดีกว่า ArrayList ยังไง มีกี่แบบ ?
    - [Doubly Linked List](https://youtube.com/shorts/wsnxm9RJws8?feature=share) ⚡️
    - [Doubly Linked List - Insertion](https://www.youtube.com/shorts/HWr5NXDsAHM) ⚡️
      
 <br/>
 
        Linked List ดีกว่า ArrayList ตรงที่
          - Linked List ไม่ได้เก็บข้อมูลในหน่วยความจำติดกัน จึงสามมารถเพิ่มข้อมูลได้โดยไม่ต้องระบุ index เหมือน Array / ArrayList
          
          - เป็น Dynamic Data Structure คือ ขยายขนาดเองได้ แบบ ArrayList แต่ไม่ต้องจองพื้นที่หน่วยความจำ เหมือน ArrayList
          

    
        idea concept ของโครงสร้างข้อมูลแบบ Linked List จึงเป็นการใช้คุณสมบัติ Object OOP มาสร้างเป็น Node โดยในแต่ละ Node จะ
        ประกอบไปด้วย 2 ส่วน คือ ข้อมูลที่จะเก็บ (data) และ ตำแหน่งของสมาชิกตัวถัดไป (Pointer) โดยใช้วิธีการ implement(เขียนโค้ด)
        แบบมี Dummy node(โหนดแรกว่างๆ/Head) หรือจะเขียนแบบไม่มี Dummy node ก็ได้ 
          -  คุณสมบัติ Object OOP ทำให้ไม่ต้องจองพื้นที่ อยากจะ add ข้อมูลตอนไหน ก็ create Node เอา ใส่ข้อมูลลงโหนด แล้วลิ้งค์ไป
        โหนดถัดไป

![Linkedlist](https://github.com/Arisa-Kaewsuan/Datastructure_Java/assets/87797742/5c7161ff-1a6e-4c7c-8f44-a1a8df096e2e)

        Linked List มีหลายแบบที่ถูกคิดค้นสร้างขึ้นใช้ในแต่ละสายงาน แต่มีตัวที่เป็นพื้นฐานควรรู้จัก อยู่ 2 ตัว คือ
          -  Singly Linked List
          
          -  Doubly Linked List : เป็น Linked List ปัจจุบันที่ใช้กัน  พัฒนามาจาก Singly Linked List ที่เร็วมาก เพิ่ม/ลบ ข้อมูล
             ที่หัวใช้เวลา O(1) แต่เจอปัญหาว่า ถ้าเพิ่ม/ลบ ข้อมูลตรงกลาง ตรงตูด หรือตำแหน่งที่ n จะใช้เวลา O(n) เพราะต้องเลื่อน
             พ้อยเตอร์เช็คไปเรื่อยๆ จึงพัฒนาให้จากชี้ทางเดียว เป็นชี้ทั้ังสองทาง ตัวก่อนหน้า และตัวถัดไป เวลาจะ เพิ่ม/ลบ ข้อมูล 
             จะเช็คก่อนว่าตัวที่จะลบ/เพิ่ม อยู่ใกล้ตูด หรือหัว ก็จะเริ่มเช็คจากทางนั้น ทำให้โปรแกรมทำงานเร็วขึ้น O(n/2)
    
  <br/>

  - &nbsp; Linked List ประยุกต์ใช้ทำอะไรได้บ้าง ?

        -  เราสามารถใช้ ArrayList มาทำ Stack กับ Queue ได้ แต่นิยมใช้ Linked List หรือ Doubly Linked List มาทำ Stack
           และ Queue มากกว่า เพราะ  มีลักษณะการ เข้า-ออก / กระทำทางเดียว จึงเหมาะใช้ Linked List ที่ถ้า กระทำแค่ตรงหัวก็จะเร็ว
           มาก O(1)  

    <br/>
    
  - &nbsp; Exerxise 1 &nbsp;:&nbsp; [Singly Linked List 🔗]()

        Exercise 1 : จงเขียนโปรแกรมสร้าง Singly Linked List ด้วยภาษา java แบบมี Dummy Node โดยมี function ต่างๆดังนี้
          -  addFirst()  
          -  addLast()  
          -  insert()  
          -  removeAt()  
        และใช้ window builder ทำ UI ออกหน้าจอด้วย

    <br/>
    
  - &nbsp; Exerxise 2 &nbsp;:&nbsp; [Doubly Linked List 🔗]()

        Exercise 2 : จงเขียนโปรแกรมสร้าง Doubly Linked List ด้วยภาษา java ด้วยภาษา java โดยมี function ต่างๆดังนี้
          -  addFirst()  
          -  addLast()  
          -  insert() 
          -  removeAt()  
        และใช้ window builder ทำ UI ออกหน้าจอด้วย

    <br/>

    > **Singly Linked List Conclusion**
    >- addFirst &nbsp;&nbsp;:&nbsp;&nbsp; O(1)
    >- addLast &nbsp;&nbsp;:&nbsp;&nbsp; O(n)
    >- insert &nbsp;&nbsp;:&nbsp;&nbsp; O(1)
    >- removeAt &nbsp;&nbsp;:&nbsp;&nbsp; O(1)
    
    >  **Doubly Linked List Conclusion**
    >- addFirst &nbsp;&nbsp;:&nbsp;&nbsp; O(1)
    >- addLast &nbsp;&nbsp;:&nbsp;&nbsp; O(ืn/2)
    >- insert &nbsp;&nbsp;:&nbsp;&nbsp; O(1)
    >- removeAt &nbsp;&nbsp;:&nbsp;&nbsp; O(1)

<br/><br/>

[<  &nbsp;Contents](https://github.com/Arisa-Kaewsuan/Datastructure_Java/blob/main/README.md)  &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; [Stack&nbsp;  >](https://github.com/Arisa-Kaewsuan/Datastructure_Java/blob/main/LinkedList.md)
