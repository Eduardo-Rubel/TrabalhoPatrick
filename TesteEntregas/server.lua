Config = require('config')
-- Função para iniciar a missão de entrega de carga
function startMission(player)
    TriggerClientEvent('chat:addMessage', player, {
        args = { "Missão Iniciada: " .. Config.Mission.name }
    })
    -- Código para spawnar a carroça
    TriggerClientEvent('vorp:spawnWagon', player, Config.Mission.startLocation, Config.Mission.wagonModel)
    -- Código para spawnar os NPCs ladrões
    TriggerClientEvent('vorp:spawnThieves', player, Config.Mission.thieves)
    -- Código para definir o ponto de destino
    TriggerClientEvent('vorp:setDestination', player, Config.Mission.destination)
end

-- Função para iniciar a missão de resgate de refém (exemplo)
function startRescueMission(player)
    TriggerClientEvent('chat:addMessage', player, {
        args = { "Missão Iniciada: Resgate de Refém" }
    })
    -- Código para iniciar a missão de resgate de refém
end

-- Eventos para iniciar as missões
RegisterNetEvent('vorp:startMission')
AddEventHandler('vorp:startMission', startMission)

RegisterNetEvent('vorp:startRescueMission')
AddEventHandler('vorp:startRescueMission', startRescueMission)