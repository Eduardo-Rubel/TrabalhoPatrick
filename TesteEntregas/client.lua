local missions = {
    { name = "Entrega de Carga", event = "vorp:startMission" },
    { name = "Resgate de Refém", event = "vorp:startRescueMission" }
}

-- Função para abrir o menu de seleção de missão
function openMissionMenu()
    local elements = {}
    for _, mission in ipairs(missions) do
        table.insert(elements, { label = mission.name, value = mission.event })
    end

    ESX.UI.Menu.Open('default', GetCurrentResourceName(), 'mission_menu', {
        title    = 'Seleção de Missão',
        align    = 'top-left',
        elements = elements
    }, function(data, menu)
        local selectedMission = data.current.value
        TriggerServerEvent(selectedMission)
        menu.close()
    end, function(data, menu)
        menu.close()
    end)
end

-- Comando para abrir o menu de seleção de missão
RegisterCommand('missao', function()
    openMissionMenu()
end, false)