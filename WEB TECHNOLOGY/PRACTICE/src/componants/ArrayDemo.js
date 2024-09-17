let array = [
    {
        name: 'abc',
        rollno: 101,
        spi:10,
        sem:2
    },

    {
        name: 'bcd',
        rollno: 102,
        spi:9,
        sem:4
    },

    {
        name: 'cdgh',
        rollno: 103,
        spi:5,
        sem:2
    },

    {
        name: 'qwe',
        rollno: 104,
        spi:9,
        sem:7
    },

    {
        name: 'iou',
        rollno: 105,
        spi:9.9,
        sem:3
    }
]

const namelist = name.map((name) => {
    return <>
        <table >
            {array.name}
        </table>
    </>
})