![image_2023_11_30T16_07_17_361Z](https://github.com/YasminKad/SE_LAB_51/assets/59180210/97646164-198b-4006-9e5c-64a4b0671b45)# SE_LAB_5
<h2>گزارش پروژه
</h2>
مراحل ستاپ کردن پروژه را مطابق با مستنداتی که ارائه شده بود انجام دادیم. اضافه کردن dependencyها و ران کردن تست از درون تب maven و مراحل این چنینی. (البته در مراحل بعدتر مجبور به استفاده از ورژن بالاتری از cucumbar شدیم چون در ورژن های پایین تر آن خطاهای عجیب و غریبی از جمله نشناختن stepهایی که در فایل های تست تعریف کرده بودیم به وجود می آمد.)
سپس فایلهای cucumbar.features را ایجاد کردیم و به دنبال آن فایل def تشکیل شد و در آن stepها را تعریف کردیم (before, after, then , ...) و هر کدام را پر کردیم.
در این میان مراحل دیباگ بسیاری بود و همچنین استفاده از روش برنامه نویسی جفتی که به فرایند سرعت بدهد و دیباگ را تسهیل کند.
در پروژه ما سعی کردیم که مراحلی که از لحاظ ریاضی تعریف نشده اند (مخرج 0 و ...) را هم با اررور هندل کنیم و همچنین خروجی ما از نوع int است که بخش اعشاری عدد را قطع می کند.
عکس هایی از مراحل ستاپ پروژه: ( بعضی از عکسها برای ورژن قبلی تر cucumber هستند که در مراحل بعدی debug به روز شده اند.)

![image_2023_11_29T16_59_31_286Z](https://github.com/YasminKad/SE_LAB_51/assets/59180210/e3a1d3a1-88f3-48b4-ae4b-a53d766f80fd)

![image_2023_11_29T17_05_30_833Z (1)](https://github.com/YasminKad/SE_LAB_51/assets/59180210/baa9dc10-0874-496f-9f88-0293684a6b02)

![image_2023_11_29T17_07_08_122Z](https://github.com/YasminKad/SE_LAB_51/assets/59180210/10e0a84f-e54d-4606-91e9-849d1859666f)

به ارورهای پیاپی خوردیم و با استمرار و پشتکار و همفکری آنها را حل کردیم :)))

![image_2023_11_30T10_29_12_441Z](https://github.com/YasminKad/SE_LAB_51/assets/59180210/38e93824-a3ff-49b0-8eb3-c764ba2833b0)

![image_2023_11_30T10_29_01_764Z](https://github.com/YasminKad/SE_LAB_51/assets/59180210/fcabf5fe-20e0-49f1-926f-0ebe6908eeb8)

بالاخره باگ ها رفع شدند و همه تست ها پاس شدند :))

![image_2023_11_30T15_33_30_360Z (2)](https://github.com/YasminKad/SE_LAB_51/assets/59180210/343d841f-ced5-4e05-96dd-19eec70916ea)

![image_2023_11_30T15_33_58_617Z](https://github.com/YasminKad/SE_LAB_51/assets/59180210/68af8588-715d-401d-926c-7b24fb4d93ed)

سناریو های نوشته شده با رویکرد BDD برای آزمون حالت های مختلف ممکن مساله:

![image_2023_11_30T16_01_52_185Z](https://github.com/YasminKad/SE_LAB_51/assets/59180210/aaad9d05-5aa7-4458-b447-f4746310aa5f)

فانکشنالیتی های لازم برای پاس شدن سناریو تست های نوشته شده را پیاده سازی کرده ایم به گونه ای که عملایت اصلی در کلاس calculator صورت میگیرد و فرایند کلی دریافت ورودی، فراخوانی تابع محاسبه ی نتیجه در calculator و همچنین نمایش خروجی متناظر نهایی در کلاس main انجام خواهد شد:

![image_2023_11_30T16_07_26_704Z](https://github.com/YasminKad/SE_LAB_51/assets/59180210/a0988520-0c98-4a65-8f69-0c8b04d091d7)

![image_2023_11_30T16_07_17_361Z](https://github.com/YasminKad/SE_LAB_51/assets/59180210/65aba24b-fa75-48ae-b629-bf2c034facff)

بعد از develop کردن کلاس ها و فانکشنالیتی های لازم برای حل مسال، مجددا تست های طراحی شده ی قبل که به علت عدم وجود توابع مورد نیاز به ارور میخوردند را دوباره اجرا می کنیم و این بار میبینم که برای همه ی سناریو های طراحی شده (از happy scenario ها تا سناریو هایی که باید با ارور مواجه شویم) تست ها پاس می شوند و در واقعیت عملیات پیاده سازی و آزمون هردو با موفقیت انجام شده اند.

![image_2023_11_30T16_10_20_388Z](https://github.com/YasminKad/SE_LAB_51/assets/59180210/2cdb59b1-dd52-4e30-b746-3647646ad7ac)

نمونه هایی از اجرای اصلی برنامه نیز در ادامه آورده شده اند که جدا از پاس شدن تست های نوشته شده، صحت عمکرد برنامه را مجددا تایید می کنند:

![image_2023_11_30T16_13_42_123Z](https://github.com/YasminKad/SE_LAB_51/assets/59180210/ffcd9c17-dd83-4d58-86f0-c2a8b87853a8)

![image_2023_11_30T16_13_29_863Z](https://github.com/YasminKad/SE_LAB_51/assets/59180210/0ac27a41-a895-4f1b-b879-1f7cd625ce27)

<h2>سوال 2</h2>



