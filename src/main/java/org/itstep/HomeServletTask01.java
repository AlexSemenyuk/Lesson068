//  1. Создать веб приложение на базе архетипа apache-maven-webapp
//  2. Из папки webapp удалить файл index.jsp
//  3. Добавить сервлет HomeServlet, который возвращает форму авторизации пользователя (ввод логина и пароля)
//  4. Зарегистрировать сервлет в дескрипторе развертывание web.xml по пути /
//  5. Прислать проект на проверку


package org.itstep;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

public class HomeServletTask01 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req,
                           HttpServletResponse resp) throws ServletException, IOException {

        resp.setContentType("text/html");
        PrintWriter writer = resp.getWriter();
        writer.println("""
                <!DOCTYPE html>
                <html lang="en">            
                <head>
                    <meta charset="UTF-8">
                    <meta http-equiv="X-UA-Compatible" content="IE=edge">
                    <meta name="viewport" content="width=device-width, initial-scale=1.0">
                    <title>Task01</title>
                    <link rel="stylesheet" href="https://unpkg.com/@picocss/pico@1.*/css/pico.min.css">
                    <style>
                        :root {
                            /* text color */
                            --color-text-primary: rgba(0, 0, 0, 1);
                            --color-text-secondary: rgba(255, 255, 255, 1);
                        
                            /* background */
                            --color-background-main: rgb(210, 210, 210, 1);
                            --color-background-aside: rgb(230, 230, 230, 1);
                           
                            /* text */
                            --text-primary: "Arial", sans-serif;                      
                        }
                        
                        body {
                             color: var(--color-text-primary);
                             display: grid;
                             grid-template-columns: 65% 35%;
                         }
                         main {
                             background-color: var(--color-background-main);
                         }
                          aside {
                             background-color: var(--color-background-aside);
                         }
                         .form {
                             margin: 10px;
                         }
                         div {
                             display: grid;
                             grid-template-columns: 25% 75%;
                             margin-top: 20px;
                         }
                         label {
                             display: inline-block;
                        
                         }
                         input {
                             display: inline-block;
                             background-color: var(--color-text-secondary);
                         }
                         #login, #password {
                             text-indent: 1em;
                             margin: 0px;
                             padding: 0px;
                         }
                         .but-submit {
                             margin-top: 20px;
                         }
                         .label-input {
                            margin: 0px;
                            line-height: 59px
                         }
                    </style>
                </head>
                <body>
                <main></main>
                <aside>
             
                <form method="GET" class="form">
                  <div>
                  <label class="label-input" for="login">Login</label>              
                  <input id="login" type="text" name="login" placeholder="Input your login"/>
                  </div>
                  <div>
                  <label class="label-input" for="password">Password</label>
                  <input id="password" type="text" name="password" placeholder="Input your password"/>
                  </div>
                  <input class="but-submit" type="submit" value="Submit"/>
                </form>
                </aside>
                <body>
                </html>
                """);
    }
}

