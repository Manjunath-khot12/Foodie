<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Success Message</title>
    <style>
        body {
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            margin: 0;
            background-color: #f5f5f5;
            font-family: Arial, sans-serif;
        }

        .success-container {
            background-color: #4CAF50;
            padding: 20px 40px;
            border-radius: 10px;
            box-shadow: 0 4px 10px rgba(0, 0, 0, 0.1);
            opacity: 0;
            animation: fadeIn 1s forwards, bounce 0.5s 1s;
            text-align: center;
        }

        .success-message {
            color: white;
            font-size: 24px;
            margin: 0;
        }

        .menu-link, .back-link {
            display: inline-block;
            margin-top: 20px;
            padding: 10px 20px;
            background-color: white;
            color: #4CAF50;
            text-decoration: none;
            border-radius: 5px;
            font-size: 18px;
            transition: background-color 0.3s, color 0.3s;
            margin-right: 10px;
        }

        .menu-link:hover, .back-link:hover {
            background-color: #4CAF50;
            color: white;
        }

        @keyframes fadeIn {
            from {
                opacity: 0;
                transform: scale(0.9);
            }
            to {
                opacity: 1;
                transform: scale(1);
            }
        }

        @keyframes bounce {
            0%, 20%, 50%, 80%, 100% {
                transform: translateY(0);
            }
            40% {
                transform: translateY(-10px);
            }
            60% {
                transform: translateY(-5px);
            }
        }
    </style>
</head>
<body>
    <div class="success-container">
        <h1 class="success-message">Restaurant Created Successfully!</h1>
        <a href="AddMenu.html" class="menu-link">Add Menu</a>
        <a href="index.jsp" class="back-link">Back to Home</a>
        
    </div>
</body>
</html>
