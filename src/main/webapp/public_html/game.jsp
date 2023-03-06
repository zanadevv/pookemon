<%--
  User: zana
  Date: 21/2/23
  Time: 15:20
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <title>Game</title>
    <link rel="stylesheet" href="../style/main.css">
    <link rel="stylesheet" href="../style/index.css">
    <link rel="stylesheet" href="../style/game.css">
</head>
<body>
<div class="container">
    <jsp:include page="../includes/headerInclude.jsp" flush="true"/>
    <section>
        <div class="scenarioText">
            <h2>Elige tu Escenario</h2>
        </div>
        <div id="hud">
            <div class="playerController">
                <div id="player1">
                    <h2>Jugador 1</h2>
                    <button class="attack">Ataque</button>
                    <button class="attackSpecial">Ataque Especial</button>
                    <button class="spell">Habilidad</button>
                    <button class="protect">Protegerse</button>
                </div>
            </div>
            <div class="scenarioContainer">
                <div id="scenario1"><img src="${pageContext.request.contextPath}/assets/img/scenarios/3hqfdsb9uvg11.webp" alt=""></div>
                <div id="scenario2"><img src="${pageContext.request.contextPath}/assets/img/scenarios/3hqfdsb9uvg11.webp" alt=""></div>
                <div id="scenario3"><img src="${pageContext.request.contextPath}/assets/img/scenarios/3hqfdsb9uvg11.webp" alt=""></div>
                <div id="scenario4"><img src="${pageContext.request.contextPath}/assets/img/scenarios/3hqfdsb9uvg11.webp" alt=""></div>
                <div id="scenario5"><img src="${pageContext.request.contextPath}/assets/img/scenarios/3hqfdsb9uvg11.webp" alt=""></div>
                <div id="scenario6"><img src="${pageContext.request.contextPath}/assets/img/scenarios/3hqfdsb9uvg11.webp" alt=""></div>
            </div>
            <div class="playerController">
                <div id="player2">
                    <h2>Jugador 2</h2>
                    <button class="attack">Ataque</button>
                    <button class="attackSpecial">Ataque Especial</button>
                    <button class="spell">Habilidad</button>
                    <button class="protect">Protegerse</button>
                </div>
            </div>
        </div>
    </section>
</div>
<script src="../scripts/gameScenario.js"></script>
</body>
</html>
