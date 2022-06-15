const express = require('express');
const app = express();
app.use(express.json());

var teams = [
    {
        team_id: 1,
        name: "Staraptors",
        size: 5,
        subject: "18ES690",
        members: ["Sanjaykumar S", "Jeswin W", "Aravinth S", "Jeyaganesh A V", "Rahul Hariesh B"]
    },
    {
        team_id: 2,
        name: "Tech Tuners",
        size: 3,
        subject: "18ES690",
        members: ["Velmurugan M", "Jaga Ganesh D", "Lokkeshwaran S"]
    }
]

var server = app.listen(4846, ()=>{
    console.log("Server is listening at 4846!");
})

//GET

//get all
app.get('/teams', (req, res)=>{
    res.send(teams);
})

//get particular team
app.get('/team', (req, res)=>{
    const id = req.query.id;
    for(let i=0; i<teams.length; i++)
    {
        if(teams[i].team_id == id)
        {
            var team = teams[i];
            break;
        }
    }
    res.send(team);
})

//DELETE
app.delete('/remove_team',(req, res)=>{
    const id = req.query.id;
    for(let i=0; i<teams.length; i++)
    {
        if(teams[i].team_id == id)
        {
            var team = teams[i];
            break;
        }
    }
    teams.splice(team,1);
    res.send(teams);
})


//PUT
app.put('/update_teamname', (req, res)=>{
    const id = req.query.id;
    const team_name = req.query.team_name;
    for(let i = 0; i<teams.length; i++)
    {
        if(teams[i].team_id == id)
        {
            teams[i]["name"] = team_name;
        }
    }
    res.send(teams);
})


//POST
app.post('/team_members', (req, res)=>{
    const id = req.query.id;
    for(let i=0; i<teams.length; i++)
    {
        if(teams[i].team_id == id)
        {
            var team = teams[i];
            break;
        }
    }
    res.send(team.members);
})