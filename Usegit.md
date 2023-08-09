[**🔗 วิธี add Project จาก Eclipse ขึ้น Github**](https://www.youtube.com/watch?v=LPT7v69guVY)
 - &nbsp; **Step 1 &nbsp;:&nbsp;** ต้องมี repository ก่อน (repo หรือ repository คือ ที่เก็บ code ของเราบนเว็บ Github) 

       ดังนั้นเราจึงต้องมี account github ก่อน >>  แล้ว sign in >>  แล้ว create new repository >> copy URL

       -----------------------------------------------------------------------------------------------------------------
        # ถ้าใครยังไม่ค่อยเก็ทว่า repository คืออะไร ต่างกับโฟลเดอร์บนคอมยังไง จริงๆแล้ว repository ก็คือ Folder ต่างกันตรงที่
         -  repository เราไว้ใช้เรียก Folder หรือก็โปรแกรมจัดเก็บข้อมูลที่ทำงานอยู่บน cloud หรือก็คือ web
         -  ส่วน folder เราไว้ใช้เรียก Folder หรือก็คือโปรแกรมจัดเก็บข้อมูลที่ทำงานอยู่บนเครืองของเรา บน local
   
 - &nbsp; **Step 2 &nbsp;:&nbsp;** clone repo ที่สร้างบนเว็บ Github มาไว้บน Eclipse / บนคอมเรา / บน local ( มันเรียกได้หลายอย่าง แต่ความหมายเดียวกัน )

        เปิด Eclipse
        >>  ไปที่ window บน menu bar  >>  กด Show menu  >>  กด Other  >>  กด Clone Repository
        >>  วาง URL ที่ copy มา  >>  ทำตามที่โปรแกรมบอกเพื่อเชื่อมต่อ (remote) repoบนเว็บgithub กับ folderบนคอมเรา

       -----------------------------------------------------------------------------------------------------------------
        # Eclipse คือ โปรแกรมที่ถูกสร้างมา เพื่อใช้ในการพัฒนาภาษา Java  หรือจะเรียกว่าเป็น  integrated development environment
          (IDE) สำหรับพัฒนา applications โดยใช้ java หรือภาษาอื่น ๆ เช่น C/C++, Python, PERL, Ruby ฯลฯ IDE คือ Tool ที่รวมเครื่อง
          มือต่างๆที่ใช้ในการพัฒนาโปรแกรมด้วยภาษานั้นๆ  เช่น
             -   Runtime/ Compiler/ Interpreter  :  คือตัวแปลภาษาโปรแกรม เช่น java , C++ , ... เป็นภาษาเครื่อง (machine code
                 1,0) ที่คอมพิวเตอร์เข้าใจ  ในแต่ละภาษาก็จะมีชื่อเรียกต่างกันไป  เช่น  ใน java เรียก jdk (java development kit) เราต้อง
                 install jdk ลงเครื่องเราก่อน Eclipse ถึงจะสามารถแปลภาษา java นี้ได้ run ดูผลลัพธ์ได้
   
             -   Editor : ใช้เขียน code แก้ไข/edit code มันจะมีฟีเจอร์พวก Debuger ใช้ debug code ดู error ได้ / มี code snippet
                 หรือบางครั้งก็เรียก syntax auto complete คือ รวมชุดคำสั่งที่ใช้บ่อยๆเอาไว้ให้นักพัฒนาพิมพ์ย่อๆได้มันจะ auto complete
                 syntax ให้ ช่วยให้เขียนโค้ดสะดวกรวดเร็วขึ้น อย่างใน Eclise ถ้าพิมพ์ sysout แล้วกด crtl + spacebar มันจะ auto
                 complete ให้อัตโนมัติ ใน Eclipse สามารถใช้ฟีเจอร์นี้ได้เลย  แต่ในบาง Editor เช่น vscode ต้อง install extension
                 ก่อนถึงจะใช้ได้
   
             -   Plugin หรือ Extension : เป็นโปรแกรมย่อยเสริมที่ใช้ในการพัฒนางานเฉพาะด้าน  เช่น  GUI ใน Eclipse เรียก โปรแกรม
                 เสริมพวกนี้ว่า Plugin แต่ใน vscode เรียก Extension แต่ให้รู้ไว้ว่ามันคือ อย่างเดียวกัน  ใน Eclipse เราสามารถ install
                 Plugin เสริมพวกนี้ได้จาก  Help  >>  Eclipse margetplace  Plugin ที่นิยม เช่น window builder เป็นโปรแกรมใช้
                 Generate Java GUI

 - &nbsp; **Step 3 &nbsp;:&nbsp;** add project ที่ต้องการลง local repo และ อัพขึ้น github เพื่อสำรองข้อมูล เก็บเวอร์ชั่นการเปลี่ยนแปลงทุกๆ commit  และ แชร์กับคนอื่นๆได้

            คลิ๊กขวาที่โปรเจ็ค  >>  Team  >>  Share Project  >>  เลือก git repo ที่ clone มา  >> finish

            ตอนนี้โปรเจคเราถูกเก็บอยู่ใน local git repo แล้ว สามารถ commit เก็บเวอร์ชั่นการเปลี่ยนแปลงได้แล้ว ทุกๆ commit จะถูกเก็บไว้
            ใน local git repo ก่อน จนกว่าเราจะอยากอัพขึ้นไปเก็บบน cloud/ github repo ให้ทำการ push ไฟล์ที่ commit ไปเก็บไว้โดย

            คลิ๊กขวาที่โปรเจ็ค  >>  Team  >>  commit  >>  drag ไฟล์ commit ที่ต้องการอัพขึ้นเว็บใส่ใน stage change
            >>  พิมพ์ข้อความ comment เพื่อให้รู้ว่า commit นี้แก้อะไรไปบ้าง  >>  กด commit&push

            ให้ refresh หน้าเว็บ github ถ้าสำเร็จจะเห็นโปรเจคเราถูกเอาขึ้นไปไว้บนเว็บ github ของเราแล้ว
