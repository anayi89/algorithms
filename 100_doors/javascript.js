<html>
<body>
     <p id="demo"></p>
     <script>
      var text = "";
      var a;
      var b;

      for (a = 1; a <= 10; a++)
      {
       b = Math.pow(a, 2);
       text += "Door #" + b + " is open.<br />";
      }
      document.getElementById("demo").innerHTML = text;
    </script>
    </body>
</html>
