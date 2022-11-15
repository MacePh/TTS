import React, { useState } from 'react';

import List from './components/List';

function App() {
const [users, setUsers] = useState([
	{
	name: 'Deepak',
	rollNo: '123',
	},
	{
	name: 'Yash',
	rollNo: '124',
	},
	{
	name: 'Raj',
	rollNo: '125',
	},
	{
	name: 'Rohan',
	rollNo: '126',
	},
	{
	name: 'Puneet',
	rollNo: '127',
	},
	{
	name: 'Vivek',
	rollNo: '128',
	},
	{
	name: 'Aman',
	rollNo: '129',
	},
]);

const handlechange = (index) => {
	const newUsers = [...users];
	newUsers[index].name = 'New Name';
	newUsers[index].rollNo = 'New RollNo';
	setUsers(newUsers);
};

return (
	<div
	style={{
		display: 'flex',
		flexDirection: 'column',
		alignItems: 'flex-start',
		justifyContent: 'center',
		height: '100vh',
		margin: '40px',
	}}>
	<h4>Rendering List of components with array of data</h4>

	{users.map((Users, index) => {
		return (
		<div
			style={{
			display: 'flex',
			flexDirection: 'column',
			alignItems: 'flex-start',
			justifyContent: 'center',
			width: '200px',
			margin: '20px',
			backgroundColor: 'lightblue',
			cursor: 'pointer',
			}}
			onClick={() => {
			handlechange(index);
			}}
			key={index}>
			<List key={index} name={Users.name}
			rollNo={Users.rollNo} />
		</div>
		);
	})}
	</div>
);
}

export default App;
