
# INTRODUCTION  ![](https://user-images.githubusercontent.com/18350557/176309783-0785949b-9127-417c-8b55-ab5a4333674e.gif)
- Data Structure คืออะไร ?

          Data Structure คือ โครงสร้างข้อมูล จะเปรียบเป็นโปรแกรมๆหนึ่งก้ได้  จุดประสงค์ของโปรแกรมประเภทนี้สร้างขึ้นเพื่อ จัดเก็บ / ดึง / ลบ
      และ แก้ไขข้อมูล อาจมีฟีเจอร์อื่นๆเพิ่มเติม  เช่น sort / หา max / หา min ในวิชา Data Structure เราจะได้เรียน Data Structure
      พื้นฐานที่มีเกือบในทุกภาษาโปรแกรมว่ามันสร้างยังไง ได้แก่ ArrayList , Linked List , Queue , Stack , Tree และ Graph
  <br/>
  

- ทำไมต้องเรียนวิชา Data Structure ?

          เราต้องเรียนวิชา Data Structure เพื่อสามารถ วิเคราะห์อัลกอริทึมได้ (Algorithm Analysis) โดยการใช้เครื่องมือที่เรียกว่า BigO
      เมื่อวิเคราะห์ได้แล้ว อยากปรับปรุง code ให้ดีขึ้นก็ทำได้สองทาง คือ จะปรับปรุง Data Structure หรือ จะปรับปรุง Algorithm ในวิชา
      Data Structure เราจะได้เรียนว่า Data Structure แต่ละตัวสร้างขึ้นมายังไง โดยใช้ภาษา Java และวิเคราะห์หา BigO ของแต่ละฟีเจอร์
      ว่า Data Structure ตัวไหนทำอะไรได้เร็ว  เพื่อที่จะเลือกใช้ให้เหมาะสมกับงาน
  <br/>
  
  
- วิชา Data Structure เรียนอะไรบ้าง  เพราะอะไร ?

          1.  Array
          2.  ArrayList
          3.  Linked List
          4.  Stack
          5.  Queue
          6.  Tree
          7.  Heap
          8.  Hash
          9.  Graph
  <br/>
  
   
- BigO คืออะไร ?

          BigO เรียกชื่อ เต็มๆว่า " BigO Notation " เป็นหนึ่งใน " Symptotic notation " ที่เป็นสัญลักษณ์/สัญญากรณ์ (Notation) เป็นเครื่องมือ
      ที่ใช้อธิบายการเติบโตของฟังก์ชัน   ในการวิเคราะห์อัลกิริทึมจะนำสัญลักษณ์นี้มาใช้ในการระบุประสิทธิภาพของอัลกริทึม  ซึ่งมีการวิเคราะห์ 3 แบบ คือ
          1. วิเคราะห์ Best Case คือ เคสที่ใช้เวลาน้อยที่สุด ใช้สัญญากรณ์ " Big-Omega Notation : Ω (Lower bound) " ในการอธิบาย
          2. วิเคราะห์ General Case คือ เคสปกติ ใช้สัญญากรณ์ " Big-Teta Notation : Ө  " ในการอธิบาย
          3. วิเคราะห์ Worst Case คือ เคสที่แย่ที่สุด ใช้สัญญากรณ์ " Big-O Notation (Upper bound) " ในการอธิบาย
      แต่ในทางวิศวกรรม การออกแบบอะไรสักอย่างนึง เราต้องคำนึงถึง worst case เสมอ ดังนั้นในการออกแบบ Algorithm ก็เช่นกัน เราจะสนใจแค่ Big-O

          Big-O Notation  :  จากรูปด้านล่าง (Big-O Complexity Chart) จะเห็นว่า...
          1.  O(1) : คือ ฟังก์ชั่นค่าคงที่ (constant) ที่หมายความว่า ไม่ว่า input จะเพิ่มขึ้นเท่าไหร่ ก็ใช้เวลาทำงานเท่าเดิม ถือว่าเป็น Algorithm
              ที่เร็วมาก
  
          2.  O(log n) : คือ ฟังก์ชั่นลด (logarithmic) เป็นการทำงานที่จะลดจำนวนลูปลงครึ่งนึงทุกครั้งที่ทำเสร็จไป 1 รอบ ถือว่าเป็น Algorithm ที่เร็ว
              ตัวอย่างอัลกอริทึมที่เป็น O(log n) เช่น Binary Search Tree เพราะใช้โครงสร้างต้นไม้
  
          3.  O(n log n) : คือ ฟังก์ชั่น linearithmic มีความเร็วระดับกลางๆ ตัวอย่างอัลกอริทึมที่เป็น O(n log n) เช่น Merge Sort
  
          4.  O(n^2) : คือ ฟังก์ชั่น quadratic BigO ชนิดนี้ใช้เวลาในการทำงานเลยระดับที่เรียกว่ากลางๆ จนเริ่มเข้าขั้นแย่แล้ว เพราะว่าเวลาในในการ
              ทำงานจะเพิ่มขึ้น 4 เท่า เมื่อข้อมูลเพิ่มขึ้น 2 เท่า
  
          5.  O(2^n) : คือ ฟังก์ชั่น exponential BigO ขั้นนี้เข้าขั้นวิกฤตแล้ว ข้อมูลเพียงแค่นิดเดียวก็มีการทำงานที่มหาศาล  ตัวอย่างอัลกอริทึมที่เป็น
              O(2^n) เช่น fibonacci recursion
  
          6.  O(n!) : คือ ฟังก์ชั่น factorial เป็น BigO ที่เลงร้ายที่สุด ตัวอย่างอัลกอริทึมที่เป็น O(n!) เช่น factorial
  
  ![Logo](https://miro.medium.com/v2/resize:fit:1400/1*5ZLci3SuR0zM_QlZOADv8Q.jpeg)
  
          ประสิทธิภาพของอัลกอริทึม วัดได้จาก 2 อย่าง คือ เวลาที่ใช้ กับ หน่วยความจำที่ใช้
          1.  เวลาที่ใช้ในการรัน code (runtime) เทียบกับ input เรียกว่า " Time Complexity " ที่รับเข้ามา โดยปกติถ้า Input เพิ่มมากขึ้น โปรแกรมจะ
              ใช้เวลาในการรันนานขึ้น แต่โปรแกรมเมอร์สามารถปรับปรุง code ให้ทำงานเร็วขึ้นได้ โดยใช้ความรู้ Algorithm และ Data Structure 
  
          2.  จำนวนหน่วยความจำที่ใช้ เมื่อเทียบกับขนาด input เรียกว่า " Space Complexity "
  <br/>
  

- ทำไมต้องวิเคราะห์อัลกิริทึม (Algorithm Analysis) 

          เพื่อให้สามารถเปรียบเทียบ Algorithm ได้ว่าการเขียนแบบไหน ทำให้โปรแกรมทำงานมีประสิทธิภาพ (คือ ทำงานได้เร็ว และใช้หน่วยความจำไม่มาก)
      มากกว่ากัน  เพราะ โปรแกรม 1 โปรแกรม สามารถเขียนได้มากกว่า 1 แบบ
  <br/>
  
  
- ทำไมต้องใช้ BigO วิเคราะห์อัลกิริทึม (Algorithm Analysis) ทำไมไม่เขียนโปรแกรมนับเวลาทำงานเอา ?

          วิธิวัดความเร็วในการทำงานของ code ดัวยการเขียนโปรแกรมให้มันจับเวลา  เราเรียกว่า " benchmarking หรือ profiling " การวัดประสิทธิภาพ
      ของอัลกอริทึมด้วยวิธีนี้จะมีข้อจำกัด เพราะ ความเร็วในการทำงาน หรือประมวลผลของคอมพิวเตอร์มันขึ้นอยู่กับหลายปัจจัย ที่ต่อให้ใช้ Algorithm เดียวกัน
      แต่สภาพแวดล้อมต่างกันก็ใช้เวลาทำงานต่างกัน เช่น
          - Hardware ที่ต่างกัน ความเร็วในการทำงานย่อมต่างกัน
          - Operating System ที่ต่างกัน ความเร็วในการทำงานย่อมต่างกัน
  <br/>


- How to Algorithm Analysis

            comming  soon . . .
  <br/>

  
- Dynamic Data Structure คืออะไร ?

          Dynamic Data Structure คือ Data Structure ที่สามารถขยายขนาดเองได้  เช่น ArrayList , Linked List , Stack , Queue และ Heap
  <br/>

- Dynamic Programming คืออะไร ?

          Dynamic Programming (DP) คือ ลักษณะการเขียนโปรแกรมแบบแบ่งปัญหาที่ซับซ้อน เป็นปัญหาย่อย โดยจะเริ่มแก้ปัญหาที่มีขนาดย่อยที่สุดก่อน
      แล้วค่อย ๆ เพิ่มขอบเขตขึ้นมาจนถึงปัญหาที่มีขนาดใหญ่ที่สุด  ปัญหาย่อย (Subproblem) จะมีลักษณะเหมือนกัน แค่มีข้อมูลให้จัดการน้อยกว่า ดังนั้น
      วิธีการแก้ปัญหา DP มักจะต้องแก้ด้วย recursive function หรือไม่ก็ต้องใช้สูตรคณิตศาสตร์ทีมีลักษณะเป็นสมการเวียนเกิด (recurrence formula)

<br/><br/><br/>

[<  &nbsp;Contents](https://github.com/Arisa-Kaewsuan/Datastructure_Java/blob/main/README.md)  &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; [Array&nbsp;  >](https://github.com/Arisa-Kaewsuan/Datastructure_Java/blob/main/Array.md)
