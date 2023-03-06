let scenario1 = document.querySelector('#scenario1');
let scenario2 = document.querySelector('#scenario2');
let scenario3 = document.querySelector('#scenario3');
let scenario4 = document.querySelector('#scenario4');
let scenario5 = document.querySelector('#scenario5');
let scenario6 = document.querySelector('#scenario6');
let scenarios = [scenario1, scenario2, scenario3, scenario4, scenario5, scenario6];
let scenarioText = document.querySelector('.scenarioText');
let player1 = document.querySelector('#player1');
let player2 = document.querySelector('#player2');
//let playerController = document.querySelector('.playerController');


for(let i = 0; i<scenarios.length; i++){
    scenarios[i].addEventListener('click', (e) => {

        let selectedScenario = scenarios[i];
        let nonSelectedScenarios = scenarios.filter((scenario) => scenario !== scenarios[i]);

        nonSelectedScenarios.forEach((scenario) => {
            scenario.classList.add('nonSelected');
        });

        selectedScenario.classList.add('selected');
        scenarioText.style.display = 'none';
        player1.style.visibility = 'visible';
        player2.style.visibility = 'visible';

    });
}
