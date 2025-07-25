import React from 'react';

class Posts extends React.Component {
    constructor(props) {
        super(props);
        this.state = {
            posts: [],       // Initialize empty posts array
            isLoading: false,
            error: null
        };
    }

    async loadPosts() {
        this.setState({ isLoading: true, error: null });
        
        try {
            const response = await fetch('https://jsonplaceholder.typicode.com/posts');
            
            if (!response.ok) {
                throw new Error(`HTTP error! status: ${response.status}`);
            }
            
            const data = await response.json();
            this.setState({ 
                posts: data,
                isLoading: false 
            });
        } catch (error) {
            this.setState({ 
                error: error.message,
                isLoading: false 
            });
            console.error("Error fetching posts:", error);
        }
    }

    componentDidMount() {
        this.loadPosts();
    }

    componentDidCatch(error, info) {
        // Log error to error reporting service
        console.error("Component Error:", error, info);
        this.setState({ 
            error: 'An unexpected error occurred while rendering posts.' 
        });
    }

    render() {
        const { posts, isLoading, error } = this.state;

        if (error) {
            return <div className="error-message">{error}</div>;
        }

        return (
            <div className="posts-container">
                <h1>Posts</h1>
                
                {isLoading ? (
                    <div className="loading">Loading posts...</div>
                ) : (
                    <ul className="posts-list">
                        {posts.map(post => (
                            <li key={post.id} className="post-item">
                                <h2>{post.title}</h2>
                                <p>{post.body}</p>
                            </li>
                        ))}
                    </ul>
                )}
            </div>
        );
    }
}

export default Posts;